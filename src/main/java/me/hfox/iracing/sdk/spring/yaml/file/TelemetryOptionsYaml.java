package me.hfox.iracing.sdk.spring.yaml.file;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.sdk.spring.utils.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TelemetryOptionsYaml {

    @JsonProperty("TelemetryDiskFile")
    private String telemetryDiskFile;

    public String getTelemetryDiskFile() {
        return telemetryDiskFile;
    }

    public void setTelemetryDiskFile(String telemetryDiskFile) {
        this.telemetryDiskFile = telemetryDiskFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TelemetryOptionsYaml that = (TelemetryOptionsYaml) o;

        return new EqualsBuilder().append(telemetryDiskFile, that.telemetryDiskFile).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(telemetryDiskFile).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.build(this).detailedArray(true).simpleName(true).reflective(true).toString();
    }

}
