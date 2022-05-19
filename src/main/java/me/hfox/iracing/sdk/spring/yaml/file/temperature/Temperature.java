package me.hfox.iracing.sdk.spring.yaml.file.temperature;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Temperature {

    private final double value;
    private final TemperatureUnit type;

    public Temperature(double value, TemperatureUnit type) {
        this.value = value;
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public TemperatureUnit getType() {
        return type;
    }

    public double convertTo(TemperatureUnit type) {
        if (type == this.type) {
            return value;
        }

        return type.convertFromCelsius(this.type.convertToCelsius(value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Temperature temperature = (Temperature) o;

        return new EqualsBuilder().append(value, temperature.value).append(type, temperature.type).isEquals();
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
