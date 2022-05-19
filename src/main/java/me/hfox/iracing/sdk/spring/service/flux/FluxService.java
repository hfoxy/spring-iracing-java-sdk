package me.hfox.iracing.sdk.spring.service.flux;

import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import java.util.function.Consumer;

public interface FluxService<T> extends IntervalService {

    default boolean isAutoPublishEnabled() {
        return true;
    }

    Flux<T> getCurrentFlux();

    void subscribe(FluxSubscriber<Flux<T>> subscriber);

    default void subscribeAuto(Consumer<T> consumer) {
        subscribeAuto(
                consumer,
                error -> LoggerFactory.getLogger(getClass()).error("Unhandled error", error)
        );
    }

    default void subscribeAuto(Consumer<T> consumer, Consumer<? super Throwable> errorConsumer) {
        subscribe(flux -> flux.subscribe(consumer, errorConsumer));
    }

}
