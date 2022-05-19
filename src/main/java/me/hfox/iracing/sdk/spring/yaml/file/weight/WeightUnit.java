package me.hfox.iracing.sdk.spring.yaml.file.weight;

import java.util.Optional;
import java.util.function.Function;

public enum WeightUnit {

    GRAMS("g", v -> v * 1000, v -> v / 1000),
    KILOGRAMS("kg", v -> v, v -> v);

    private final String shorthand;
    private final Function<Double, Double> fromKgFunc;
    private final Function<Double, Double> toKgFunc;

    WeightUnit(String shorthand, Function<Double, Double> fromKgFunc, Function<Double, Double> toKmFunc) {
        this.shorthand = shorthand;
        this.fromKgFunc = fromKgFunc;
        this.toKgFunc = toKmFunc;
    }

    public String getShorthand() {
        return shorthand;
    }

    public double convertFromKg(double km) {
        return fromKgFunc.apply(km);
    }

    public double convertToKg(double original) {
        return toKgFunc.apply(original);
    }

    public static Optional<WeightUnit> findByShorthand(String shorthand) {
        for (WeightUnit type : values()) {
            if (type.getShorthand().equals(shorthand)) {
                return Optional.of(type);
            }
        }

        return Optional.empty();
    }

}
