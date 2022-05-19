package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RadiosInfoYaml {

    @JsonProperty("SelectedRadioNum")
    private String selectedRadioNum = "";
    @JsonProperty("Radio")
    private List<RadioInfoYaml> radio;

    public String getSelectedRadioNum() {
        return selectedRadioNum;
    }

    public void setSelectedRadioNum(String selectedRadioNum) {
        this.selectedRadioNum = selectedRadioNum;
    }

    public List<RadioInfoYaml> getRadio() {
        return radio;
    }

    public void setRadio(List<RadioInfoYaml> radio) {
        this.radio = radio;
    }
}
