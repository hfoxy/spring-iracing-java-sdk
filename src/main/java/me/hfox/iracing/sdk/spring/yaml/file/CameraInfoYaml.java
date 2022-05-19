package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CameraInfoYaml {

    @JsonProperty("CameraNum")
    private String cameraNum = "";
    @JsonProperty("CameraName")
    private String cameraName = "";

    public String getCameraNum() {
        return cameraNum;
    }

    public void setCameraNum(String cameraNum) {
        this.cameraNum = cameraNum;
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

}
