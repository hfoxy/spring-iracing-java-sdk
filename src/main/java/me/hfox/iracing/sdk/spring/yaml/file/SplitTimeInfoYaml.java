package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SplitTimeInfoYaml {

    @JsonProperty("Sectors")
    private List<SectorsYaml> sectors;

    public List<SectorsYaml> getSectors() {
        return sectors;
    }

    public void setSectors(List<SectorsYaml> sectors) {
        this.sectors = sectors;
    }
}
