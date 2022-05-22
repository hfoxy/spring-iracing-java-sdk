package me.hfox.iracing.sdk.spring.config;

import me.hfox.iracing.sdk.spring.utils.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "iracingsdk.flux")
public class FluxProperties {

    /*
     * Set interval for camera flux in ms
    @NotNull(message = "Camera update interval must be set")
    @Min(value = 100, message = "Camera update interval must be greater than 100ms")
    private long cameraIntervalInMs = 1000L;
     */

    @Override
    public FluxProperties clone() {
        FluxProperties props = new FluxProperties();
        return props;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FluxProperties that = (FluxProperties) o;

        return new EqualsBuilder().isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).toHashCode();
    }

    @Override
    public String toString() {
        return ToStringBuilder.build(this).detailedArray(true).simpleName(true).reflective(true).toString();
    }

}
