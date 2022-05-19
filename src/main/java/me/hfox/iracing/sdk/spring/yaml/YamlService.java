package me.hfox.iracing.sdk.spring.yaml;

import me.hfox.iracing.sdk.spring.service.flux.FluxService;
import me.hfox.iracing.sdk.spring.yaml.file.YamlFile;

public interface YamlService extends FluxService<YamlFile> {

    YamlFile getYamlFile();

}
