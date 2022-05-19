package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RadioInfoYaml {

    @JsonProperty("RadioNum")
    private String radioNum = "";
    @JsonProperty("HopCount")
    private String hopCount = "";
    @JsonProperty("NumFrequencies")
    private String numFrequencies = "";
    @JsonProperty("TunedToFrequencyNum")
    private String tunedToFrequencyNum = "";
    @JsonProperty("ScanningIsOn")
    private String scanningIsOn = "";
    @JsonProperty("Frequencies")
    private List<RadioFrequenciesYaml> frequencies;

    public String getRadioNum() {
        return radioNum;
    }

    public void setRadioNum(String radioNum) {
        this.radioNum = radioNum;
    }

    public String getHopCount() {
        return hopCount;
    }

    public void setHopCount(String hopCount) {
        this.hopCount = hopCount;
    }

    public String getNumFrequencies() {
        return numFrequencies;
    }

    public void setNumFrequencies(String numFrequencies) {
        this.numFrequencies = numFrequencies;
    }

    public String getTunedToFrequencyNum() {
        return tunedToFrequencyNum;
    }

    public void setTunedToFrequencyNum(String tunedToFrequencyNum) {
        this.tunedToFrequencyNum = tunedToFrequencyNum;
    }

    public String getScanningIsOn() {
        return scanningIsOn;
    }

    public void setScanningIsOn(String scanningIsOn) {
        this.scanningIsOn = scanningIsOn;
    }

    public List<RadioFrequenciesYaml> getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(List<RadioFrequenciesYaml> frequencies) {
        this.frequencies = frequencies;
    }
}
