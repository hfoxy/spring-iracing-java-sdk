package me.hfox.iracing.sdk.spring.yaml.file.angle;

import java.util.Optional;
import java.util.function.Function;

public enum AngleUnit {

    METERS("rad", v -> v, v -> v);

    private final String shorthand;
    private final Function<Double, Double> fromRadFunc;
    private final Function<Double, Double> toRadFunc;

    AngleUnit(String shorthand, Function<Double, Double> fromRadFunc, Function<Double, Double> toRadFunc) {
        this.shorthand = shorthand;
        this.fromRadFunc = fromRadFunc;
        this.toRadFunc = toRadFunc;
    }

    public String getShorthand() {
        return shorthand;
    }

    public double convertFromRad(double km) {
        return fromRadFunc.apply(km);
    }

    public double convertToRad(double original) {
        return toRadFunc.apply(original);
    }

    public static Optional<AngleUnit> findByShorthand(String shorthand) {
        for (AngleUnit type : values()) {
            if (type.getShorthand().equals(shorthand)) {
                return Optional.of(type);
            }
        }

        return Optional.empty();
    }

}
