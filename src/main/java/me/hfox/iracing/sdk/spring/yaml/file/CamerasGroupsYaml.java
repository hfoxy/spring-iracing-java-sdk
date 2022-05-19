package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CamerasGroupsYaml {

    @JsonProperty("GroupNum")
    private String groupNum = "";
    @JsonProperty("GroupName")
    private String groupName = "";
    @JsonProperty("IsScenic")
    private String isScenic = "";
    @JsonProperty("Cameras")
    private List<CameraInfoYaml> cameras;

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getIsScenic() {
        return isScenic;
    }

    public void setIsScenic(String isScenic) {
        this.isScenic = isScenic;
    }

    public List<CameraInfoYaml> getCameras() {
        return cameras;
    }

    public void setCameras(List<CameraInfoYaml> cameras) {
        this.cameras = cameras;
    }

}
