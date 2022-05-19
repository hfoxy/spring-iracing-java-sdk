package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CamerasInfoYaml {

    @JsonProperty("Groups")
    private List<CamerasGroupsYaml> groups;

    public List<CamerasGroupsYaml> getGroups() {
        return groups;
    }

    public void setGroups(List<CamerasGroupsYaml> groups) {
        this.groups = groups;
    }

}
