package me.hfox.iracing.sdk.spring.yaml.file.temperature;

import java.util.Optional;
import java.util.function.Function;

public enum TemperatureUnit {

    CELSIUS("C", v -> v, v -> v);

    private final String shorthand;
    private final Function<Double, Double> fromCelsiusFunc;
    private final Function<Double, Double> toCelsiusFunc;

    TemperatureUnit(String shorthand, Function<Double, Double> fromCelsiusFunc, Function<Double, Double> toCelsiusFunc) {
        this.shorthand = shorthand;
        this.fromCelsiusFunc = fromCelsiusFunc;
        this.toCelsiusFunc = toCelsiusFunc;
    }

    public String getShorthand() {
        return shorthand;
    }

    public double convertFromCelsius(double km) {
        return fromCelsiusFunc.apply(km);
    }

    public double convertToCelsius(double original) {
        return toCelsiusFunc.apply(original);
    }

    public static Optional<TemperatureUnit> findByShorthand(String shorthand) {
        for (TemperatureUnit type : values()) {
            if (type.getShorthand().equals(shorthand)) {
                return Optional.of(type);
            }
        }

        return Optional.empty();
    }

}
