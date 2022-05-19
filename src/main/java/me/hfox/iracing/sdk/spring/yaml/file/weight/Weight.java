package me.hfox.iracing.sdk.spring.yaml.file.weight;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Weight {

    private final double value;
    private final WeightUnit type;

    public Weight(double value, WeightUnit type) {
        this.value = value;
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public WeightUnit getType() {
        return type;
    }

    public double convertTo(WeightUnit type) {
        if (type == this.type) {
            return value;
        }

        return type.convertFromKg(this.type.convertToKg(value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Weight weight = (Weight) o;

        return new EqualsBuilder().append(value, weight.value).append(type, weight.type).isEquals();
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
