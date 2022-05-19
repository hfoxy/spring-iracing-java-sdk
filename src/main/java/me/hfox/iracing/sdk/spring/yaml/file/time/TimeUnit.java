package me.hfox.iracing.sdk.spring.yaml.file.time;

import java.util.Optional;
import java.util.function.Function;

public enum TimeUnit {

    SECONDS("sec", v -> v, v -> v),
    MINUTES("min", v -> v / 60, v -> v * 60),
    HOURS("hr", v -> v / 60 /60, v -> v * 60 * 60);

    private final String shorthand;
    private final Function<Double, Double> fromSecFunc;
    private final Function<Double, Double> toSecFunc;

    TimeUnit(String shorthand, Function<Double, Double> fromSecFunc, Function<Double, Double> toSecFunc) {
        this.shorthand = shorthand;
        this.fromSecFunc = fromSecFunc;
        this.toSecFunc = toSecFunc;
    }

    public String getShorthand() {
        return shorthand;
    }

    public double convertFromSeconds(double km) {
        return fromSecFunc.apply(km);
    }

    public double convertToSeconds(double original) {
        return toSecFunc.apply(original);
    }

    public static Optional<TimeUnit> findByShorthand(String shorthand) {
        for (TimeUnit type : values()) {
            if (type.getShorthand().equals(shorthand)) {
                return Optional.of(type);
            }
        }

        return Optional.empty();
    }

}
