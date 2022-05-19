package me.hfox.iracing.sdk.spring.yaml.file.angle;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Angle {

    private final double value;
    private final AngleUnit type;

    public Angle(double value, AngleUnit type) {
        this.value = value;
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public AngleUnit getType() {
        return type;
    }

    public double convertTo(AngleUnit type) {
        if (type == this.type) {
            return value;
        }

        return type.convertFromRad(this.type.convertToRad(value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Angle angle = (Angle) o;

        return new EqualsBuilder().append(value, angle.value).append(type, angle.type).isEquals();
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
