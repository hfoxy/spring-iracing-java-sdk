package me.hfox.iracing.sdk.spring.yaml.file.length;

import java.util.Optional;
import java.util.function.Function;

public enum LengthUnit {

    METERS("m", v -> v * 1000, v -> v / 1000),
    KILOMETERS("km", v -> v, v -> v);

    private final String shorthand;
    private final Function<Double, Double> fromKmFunc;
    private final Function<Double, Double> toKmFunc;

    LengthUnit(String shorthand, Function<Double, Double> fromKmFunc, Function<Double, Double> toKmFunc) {
        this.shorthand = shorthand;
        this.fromKmFunc = fromKmFunc;
        this.toKmFunc = toKmFunc;
    }

    public String getShorthand() {
        return shorthand;
    }

    public double convertFromKm(double km) {
        return fromKmFunc.apply(km);
    }

    public double convertToKm(double original) {
        return toKmFunc.apply(original);
    }

    public static Optional<LengthUnit> findByShorthand(String shorthand) {
        for (LengthUnit type : values()) {
            if (type.getShorthand().equals(shorthand)) {
                return Optional.of(type);
            }
        }

        return Optional.empty();
    }

}
