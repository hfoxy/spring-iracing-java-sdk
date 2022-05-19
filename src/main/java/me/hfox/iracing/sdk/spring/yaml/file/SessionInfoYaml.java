package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.sdk.spring.utils.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionInfoYaml {

    @JsonProperty("NumSession")
    private Integer numSessions;
    @JsonProperty("Sessions")
    private List<SessionYaml> sessions;

    public Integer getNumSessions() {
        return numSessions;
    }

    public void setNumSessions(Integer numSessions) {
        this.numSessions = numSessions;
    }

    public List<SessionYaml> getSessions() {
        return sessions;
    }

    public void setSessions(List<SessionYaml> sessions) {
        this.sessions = sessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        SessionInfoYaml that = (SessionInfoYaml) o;

        return new EqualsBuilder().append(numSessions, that.numSessions).append(sessions, that.sessions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(numSessions)
                .append(sessions).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.build(this).detailedArray(true).simpleName(true).reflective(true).toString();
    }

}
