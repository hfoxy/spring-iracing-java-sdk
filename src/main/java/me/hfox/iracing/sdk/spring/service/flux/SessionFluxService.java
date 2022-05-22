package me.hfox.iracing.sdk.spring.service.flux;

public interface SessionFluxService {

    boolean isSessionBased();

    void resetForNewSession();

}
