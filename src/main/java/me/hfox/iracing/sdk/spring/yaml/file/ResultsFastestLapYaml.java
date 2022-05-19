package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsFastestLapYaml {

    @JsonProperty("CarIdx")
    private Integer carIdx;

    @JsonProperty("FastestLap")
    private Integer fastestLap;

    @JsonProperty("FastestTime")
    private Double fastestTime;

    public Integer getCarIdx() {
        return carIdx;
    }

    public void setCarIdx(Integer carIdx) {
        this.carIdx = carIdx;
    }

    public Integer getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(Integer fastestLap) {
        this.fastestLap = fastestLap;
    }

    public Double getFastestTime() {
        return fastestTime;
    }

    public void setFastestTime(Double fastestTime) {
        this.fastestTime = fastestTime;
    }
}
