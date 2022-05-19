package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QualifyResultInfoYaml {

    @JsonProperty("Position")
    private String position = "";
    @JsonProperty("ClassPosition")
    private String classPosition = "";
    @JsonProperty("CarIdx")
    private String carIdx = "";
    @JsonProperty("FastestLap")
    private String fastestLap = "";
    @JsonProperty("FastestTime")
    private String fastestTime = "";

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClassPosition() {
        return classPosition;
    }

    public void setClassPosition(String classPosition) {
        this.classPosition = classPosition;
    }

    public String getCarIdx() {
        return carIdx;
    }

    public void setCarIdx(String carIdx) {
        this.carIdx = carIdx;
    }

    public String getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(String fastestLap) {
        this.fastestLap = fastestLap;
    }

    public String getFastestTime() {
        return fastestTime;
    }

    public void setFastestTime(String fastestTime) {
        this.fastestTime = fastestTime;
    }

}
