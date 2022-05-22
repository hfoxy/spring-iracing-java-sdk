package me.hfox.iracing.sdk.spring.service.flux;

import me.hfox.iracing.sdk.spring.config.FluxProperties;
import me.hfox.iracing.sdk.spring.sdk.SdkStarter;
import me.hfox.iracing.sdk.spring.yaml.YamlService;

public abstract class SdkFluxListServiceImpl<ID, T> extends FluxListServiceImpl<ID, T> {

    protected final SdkStarter sdkStarter;
    protected final YamlService yamlService;

    public SdkFluxListServiceImpl(FluxProperties fluxProperties, SdkStarter sdkStarter, YamlService yamlService) {
        super(fluxProperties);
        this.sdkStarter = sdkStarter;
        this.yamlService = yamlService;
    }

}
