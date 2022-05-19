package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SectorsYaml {

    @JsonProperty("SectorNum")
    private String sectorNum = "";
    @JsonProperty("SectorStartPct")
    private String sectorStartPct = "";

    public String getSectorNum() {
        return sectorNum;
    }

    public void setSectorNum(String sectorNum) {
        this.sectorNum = sectorNum;
    }

    public String getSectorStartPct() {
        return sectorStartPct;
    }

    public void setSectorStartPct(String sectorStartPct) {
        this.sectorStartPct = sectorStartPct;
    }
}
