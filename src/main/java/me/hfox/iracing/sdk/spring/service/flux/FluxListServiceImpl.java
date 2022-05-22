package me.hfox.iracing.sdk.spring.service.flux;

import me.hfox.iracing.sdk.spring.config.FluxProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedTransferQueue;

public abstract class FluxListServiceImpl<ID, T> implements FluxListService<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FluxListServiceImpl.class);

    private final Set<FluxSubscriber<Flux<T>>> subscribers;
    private final Set<FluxSubscriber<Flux<List<T>>>> listSubscribers;
    private final Map<ID, Flux<T>> fluxes;
    private final Map<ID, Queue<T>> queues;

    private final Map<ID, T> previous;
    private final Queue<List<T>> listQueue;

    private Set<Disposable> subscriptions;
    private FluxProperties fluxProperties;
    private Flux<Set<ID>> updateFlux;
    private Disposable updateFluxSubscription;

    private Flux<List<T>> listFlux;

    public FluxListServiceImpl(FluxProperties fluxProperties) {
        this.subscribers = new HashSet<>();
        this.listSubscribers = new HashSet<>();
        this.fluxes = new ConcurrentHashMap<>();
        this.queues = new ConcurrentHashMap<>();
        this.previous = new ConcurrentHashMap<>();
        this.listQueue = new LinkedTransferQueue<>();
        this.subscriptions = new HashSet<>();
        setProperties(fluxProperties);
    }

    @Override
    public void resetForNewSession() {
        if (isSessionBased()) {
            listQueue.clear();
            previous.clear();
        }
    }

    @Override
    public Flux<T> getCurrentFlux() {
        return Flux.never();
    }

    @Override
    public Flux<List<T>> getCurrentListFlux() {
        return listFlux;
    }

    public Flux<List<T>> loadListFlux() {
        return Flux.interval(Duration.ofMillis(getIntervalMillis()))
                .mapNotNull(l -> listQueue.poll())
                .publishOn(Schedulers.parallel()).share();
    }

    public FluxProperties getProperties() {
        return fluxProperties;
    }

    @Override
    public void setProperties(FluxProperties fluxProperties) {
        this.fluxProperties = fluxProperties;
        this.updateFlux = getUpdateFlux();

        Disposable existingUpdateSub = this.updateFluxSubscription;
        this.updateFluxSubscription = updateFlux.subscribe(this::setEntries);
        if (existingUpdateSub != null) {
            existingUpdateSub.dispose();
        }

        this.listFlux = loadListFlux();

        Set<Disposable> existingSubs = subscriptions;
        this.subscriptions = new HashSet<>();
        this.fluxes.clear();
        for (FluxSubscriber<Flux<T>> subscriber : subscribers) {
            subscribe(subscriber);
        }

        for (FluxSubscriber<Flux<List<T>>> subscriber : listSubscribers) {
            subscribeList(subscriber);
        }

        for (Disposable disposable : existingSubs) {
            disposable.dispose();
        }
    }

    @Override
    public void subscribe(FluxSubscriber<Flux<T>> subscriber) {
        this.subscribers.add(subscriber);
        for (Entry<ID, Flux<T>> entry : fluxes.entrySet()) {
            Flux<T> flux = entry.getValue();
            addFlux(subscriber, entry.getKey(), flux);
        }
    }

    @Override
    public void subscribeList(FluxSubscriber<Flux<List<T>>> subscriber) {
        this.listSubscribers.add(subscriber);
        this.subscriptions.add(subscriber.subscribe(getCurrentListFlux()));
    }

    private void addFlux(ID id, Flux<T> flux) {
        for (FluxSubscriber<Flux<T>> subscriber : subscribers) {
            addFlux(subscriber, id, flux);
        }
    }

    private void addFlux(FluxSubscriber<Flux<T>> subscriber, ID id, Flux<T> flux) {
        subscriptions.add(subscriber.subscribe(flux));
    }

    public void setEntries(Set<ID> entries) {
        for (ID id : entries) {
            if (!fluxes.containsKey(id)) {
                Flux<T> flux = getFlux(id);
                queues.put(id, new LinkedTransferQueue<>());
                fluxes.put(id, flux);
                addFlux(id, flux);
            }
        }

        if (entries.isEmpty()) {
            return;
        }

        transform(Flux.fromIterable(entries).flatMap(this::loadData), entries.size())
                .single()
                .onErrorReturn(NoSuchElementException.class, new ArrayList<>())
                .subscribe(list -> {
                    List<T> filtered = new ArrayList<>();
                    for (T obj : list) {
                        ID id = getId(obj);
                        if (!isPreviousMatch(id, obj) || isForcePush(id, obj)) {
                            previous.put(id, obj);
                            queues.get(id).add(obj);
                            filtered.add(obj);
                        }
                    }

                    listQueue.add(filtered);
                });
    }

    public boolean isForcePush(ID id, T obj) {
        return false;
    }

    public boolean isPreviousMatch(ID id, T obj) {
        return Objects.equals(previous.get(id), obj);
    }

    public abstract Flux<Set<ID>> getUpdateFlux();

    public Flux<T> getFlux(ID id) {
        return Flux.interval(Duration.ofMillis(getIntervalMillis()))
                .filter(l -> queues.get(id) != null)
                .mapNotNull(l -> queues.get(id).poll())
                .publishOn(Schedulers.parallel()).share();
    }

    public abstract long getIntervalMillis();

    public abstract ID getId(T obj);

    public abstract Flux<T> loadData(ID id);

    public Flux<List<T>> transform(Flux<T> flux, int totalSize) {
        return flux.buffer(totalSize);
    }

}
