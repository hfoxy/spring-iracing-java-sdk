package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RadioFrequenciesYaml {

    @JsonProperty("FrequencyNum")
    private String frequencyNum = "";
    @JsonProperty("FrequencyName")
    private String frequencyName = "";
    @JsonProperty("Priority")
    private String priority = "";
    @JsonProperty("CarIdx")
    private String carIdx = "";
    @JsonProperty("EntryIdx")
    private String entryIdx = "";
    @JsonProperty("ClubID")
    private String clubID = "";
    @JsonProperty("CanScan")
    private String canScan = "";
    @JsonProperty("CanSquawk")
    private String canSquawk = "";
    @JsonProperty("Muted")
    private String muted = "";
    @JsonProperty("IsMutable")
    private String isMutable = "";
    @JsonProperty("IsDeletable")
    private String isDeletable = "";

    public String getFrequencyNum() {
        return frequencyNum;
    }

    public void setFrequencyNum(String frequencyNum) {
        this.frequencyNum = frequencyNum;
    }

    public String getFrequencyName() {
        return frequencyName;
    }

    public void setFrequencyName(String frequencyName) {
        this.frequencyName = frequencyName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCarIdx() {
        return carIdx;
    }

    public void setCarIdx(String carIdx) {
        this.carIdx = carIdx;
    }

    public String getEntryIdx() {
        return entryIdx;
    }

    public void setEntryIdx(String entryIdx) {
        this.entryIdx = entryIdx;
    }

    public String getClubID() {
        return clubID;
    }

    public void setClubID(String clubID) {
        this.clubID = clubID;
    }

    public String getCanScan() {
        return canScan;
    }

    public void setCanScan(String canScan) {
        this.canScan = canScan;
    }

    public String getCanSquawk() {
        return canSquawk;
    }

    public void setCanSquawk(String canSquawk) {
        this.canSquawk = canSquawk;
    }

    public String getMuted() {
        return muted;
    }

    public void setMuted(String muted) {
        this.muted = muted;
    }

    public String getIsMutable() {
        return isMutable;
    }

    public void setIsMutable(String isMutable) {
        this.isMutable = isMutable;
    }

    public String getIsDeletable() {
        return isDeletable;
    }

    public void setIsDeletable(String isDeletable) {
        this.isDeletable = isDeletable;
    }

}
