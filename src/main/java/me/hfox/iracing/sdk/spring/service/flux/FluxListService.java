package me.hfox.iracing.sdk.spring.service.flux;

import reactor.core.publisher.Flux;

import java.util.List;
import java.util.function.Consumer;

public interface FluxListService<T> extends FluxService<T>, SessionFluxService {

    Flux<List<T>> getCurrentListFlux();

    void subscribeList(FluxSubscriber<Flux<List<T>>> subscriber);

    default void subscribeListAuto(Consumer<List<T>> consumer) {
        subscribeList(flux -> flux.subscribe(consumer));
    }

}
