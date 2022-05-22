package me.hfox.iracing.sdk.spring.service.flux;

import me.hfox.iracing.sdk.spring.config.FluxProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class FluxServiceImpl<T> implements FluxService<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FluxServiceImpl.class);

    private Map<FluxSubscriber<Flux<T>>, Disposable> subscribers;

    private FluxProperties fluxProperties;
    private Flux<T> flux;

    public FluxServiceImpl(FluxProperties fluxProperties) {
        this.subscribers = new ConcurrentHashMap<>();
        setProperties(fluxProperties);
    }

    @Override
    public Flux<T> getCurrentFlux() {
        return flux;
    }

    public FluxProperties getProperties() {
        return fluxProperties;
    }

    @Override
    public void setProperties(FluxProperties fluxProperties) {
        this.fluxProperties = fluxProperties;
        this.flux = getFlux().share();

        for (Map.Entry<FluxSubscriber<Flux<T>>, Disposable> entry : subscribers.entrySet()) {
            entry.getValue().dispose();
            subscribe(entry.getKey());
        }
    }

    @Override
    public void subscribe(FluxSubscriber<Flux<T>> subscriber) {
        subscribers.put(subscriber, subscriber.subscribe(flux));
    }

    public abstract Flux<T> getFlux();

}
