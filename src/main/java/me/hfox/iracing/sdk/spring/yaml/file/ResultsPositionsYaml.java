package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.sdk.spring.utils.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsPositionsYaml {

    @JsonProperty("Position")
    private Integer position;

    @JsonProperty("ClassPosition")
    private Integer classPosition;

    @JsonProperty("CarIdx")
    private Integer carIdx;

    @JsonProperty("Lap")
    private Integer lap;

    @JsonProperty("Time")
    private Float time;

    @JsonProperty("FastestLap")
    private Integer fastestLap;

    @JsonProperty("FastestTime")
    private Float fastestTime;

    @JsonProperty("LastTime")
    private Float lastTime;

    @JsonProperty("LapsLed")
    private Integer lapsLed;

    @JsonProperty("LapsComplete")
    private Integer lapsComplete;

    @JsonProperty("LapsDriven")
    private Float lapsDriven;

    @JsonProperty("Incidents")
    private Integer incidents;

    @JsonProperty("ReasonOutId")
    private Integer reasonOutId;

    @JsonProperty("ReasonOutStr")
    private String reasonOutStr;

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getClassPosition() {
        return classPosition;
    }

    public void setClassPosition(Integer classPosition) {
        this.classPosition = classPosition;
    }

    public Integer getCarIdx() {
        return carIdx;
    }

    public void setCarIdx(Integer carIdx) {
        this.carIdx = carIdx;
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    public Integer getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(Integer fastestLap) {
        this.fastestLap = fastestLap;
    }

    public Float getFastestTime() {
        return fastestTime;
    }

    public void setFastestTime(Float fastestTime) {
        this.fastestTime = fastestTime;
    }

    public Float getLastTime() {
        return lastTime;
    }

    public void setLastTime(Float lastTime) {
        this.lastTime = lastTime;
    }

    public Integer getLapsLed() {
        return lapsLed;
    }

    public void setLapsLed(Integer lapsLed) {
        this.lapsLed = lapsLed;
    }

    public Integer getLapsComplete() {
        return lapsComplete;
    }

    public void setLapsComplete(Integer lapsComplete) {
        this.lapsComplete = lapsComplete;
    }

    public Float getLapsDriven() {
        return lapsDriven;
    }

    public void setLapsDriven(Float lapsDriven) {
        this.lapsDriven = lapsDriven;
    }

    public Integer getIncidents() {
        return incidents;
    }

    public void setIncidents(Integer incidents) {
        this.incidents = incidents;
    }

    public Integer getReasonOutId() {
        return reasonOutId;
    }

    public void setReasonOutId(Integer reasonOutId) {
        this.reasonOutId = reasonOutId;
    }

    public String getReasonOutStr() {
        return reasonOutStr;
    }

    public void setReasonOutStr(String reasonOutStr) {
        this.reasonOutStr = reasonOutStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ResultsPositionsYaml that = (ResultsPositionsYaml) o;

        return new EqualsBuilder().append(position, that.position).append(classPosition, that.classPosition)
                .append(carIdx, that.carIdx).append(lap, that.lap).append(time, that.time)
                .append(fastestLap, that.fastestLap).append(fastestTime, that.fastestTime)
                .append(lastTime, that.lastTime).append(lapsLed, that.lapsLed).append(lapsComplete, that.lapsComplete)
                .append(lapsDriven, that.lapsDriven).append(incidents, that.incidents)
                .append(reasonOutId, that.reasonOutId).append(reasonOutStr, that.reasonOutStr).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(position).append(classPosition)
                .append(carIdx).append(lap).append(time).append(fastestLap).append(fastestTime).append(lastTime)
                .append(lapsLed).append(lapsComplete).append(lapsDriven).append(incidents).append(reasonOutId)
                .append(reasonOutStr).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.build(this).detailedArray(true).simpleName(true).reflective(true).toString();
    }

}
