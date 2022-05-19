package me.hfox.iracing.sdk.spring.yaml.file.percentage;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Percentage {

    private final double value;

    public Percentage(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Percentage percentage = (Percentage) o;

        return new EqualsBuilder().append(value, percentage.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return "Percentage{'" + value * 100 + " %'}";
    }

}
