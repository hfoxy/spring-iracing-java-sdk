package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QualifyResultsInfoYaml {

    @JsonProperty
    private List<QualifyResultInfoYaml> results;

    public List<QualifyResultInfoYaml> getResults() {
        return results;
    }

    public void setResults(List<QualifyResultInfoYaml> results) {
        this.results = results;
    }

}
