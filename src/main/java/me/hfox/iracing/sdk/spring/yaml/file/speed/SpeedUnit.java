package me.hfox.iracing.sdk.spring.yaml.file.speed;

import java.util.Optional;
import java.util.function.Function;

public enum SpeedUnit {

    METERS_PER_SECOND("m/s", v -> v / 3.6, v -> v * 3.6),
    KILOMETERS_PER_HOUR("kph", v -> v, v -> v),
    KMH("km/h", v -> v, v -> v),
    MILES_PER_HOUR("mph", v -> v * 1.60934, v -> v / 1.60934);

    private final String shorthand;
    private final Function<Double, Double> fromKphFunc;
    private final Function<Double, Double> toKphFunc;

    SpeedUnit(String shorthand, Function<Double, Double> fromKphFunc, Function<Double, Double> toKphFunc) {
        this.shorthand = shorthand;
        this.fromKphFunc = fromKphFunc;
        this.toKphFunc = toKphFunc;
    }

    public String getShorthand() {
        return shorthand;
    }

    public double convertFromKph(double km) {
        return fromKphFunc.apply(km);
    }

    public double convertToKph(double original) {
        return toKphFunc.apply(original);
    }

    public static Optional<SpeedUnit> findByShorthand(String shorthand) {
        for (SpeedUnit type : values()) {
            if (type.getShorthand().equals(shorthand)) {
                return Optional.of(type);
            }
        }

        return Optional.empty();
    }

}
