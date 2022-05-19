package me.hfox.iracing.sdk.spring.service.flux;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface FluxSubscriber<T extends Flux<?>> {

    Disposable subscribe(T flux);

}
