package me.hfox.iracing.sdk.spring.yaml.file.length;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Length {

    private final double value;
    private final LengthUnit type;

    public Length(double value, LengthUnit type) {
        this.value = value;
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getType() {
        return type;
    }

    public double convertTo(LengthUnit type) {
        if (type == this.type) {
            return value;
        }

        return type.convertFromKm(this.type.convertToKm(value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        return new EqualsBuilder().append(value, length.value).append(type, length.type).isEquals();
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
