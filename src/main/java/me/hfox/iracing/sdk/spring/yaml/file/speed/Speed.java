package me.hfox.iracing.sdk.spring.yaml.file.speed;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Speed {

    private final double value;
    private final SpeedUnit type;

    public Speed(double value, SpeedUnit type) {
        this.value = value;
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public SpeedUnit getType() {
        return type;
    }

    public double convertTo(SpeedUnit type) {
        if (type == this.type) {
            return value;
        }

        return type.convertFromKph(this.type.convertToKph(value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Speed speed = (Speed) o;

        return new EqualsBuilder().append(value, speed.value).append(type, speed.type).isEquals();
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
