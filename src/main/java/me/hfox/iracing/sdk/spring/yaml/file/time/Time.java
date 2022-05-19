package me.hfox.iracing.sdk.spring.yaml.file.time;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Time {

    private boolean unlimited;
    private double value;
    private TimeUnit type;

    public Time() {
        // needed for mongo
    }

    public Time(boolean unlimited) {
        this.unlimited = unlimited;
        this.value = Double.MAX_VALUE;
        this.type = TimeUnit.HOURS;
    }

    public Time(double value, TimeUnit type) {
        this.unlimited = false;
        this.value = value;
        this.type = type;
    }

    public boolean isUnlimited() {
        return unlimited;
    }

    public double getValue() {
        return value;
    }

    public TimeUnit getType() {
        return type;
    }

    public double convertTo(TimeUnit type) {
        if (type == this.type) {
            return value;
        }

        return type.convertFromSeconds(this.type.convertToSeconds(value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Time time = (Time) o;

        return new EqualsBuilder().append(value, time.value).append(type, time.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return "Length{'" + value + " " + type.getShorthand() + "'}";
    }

}
