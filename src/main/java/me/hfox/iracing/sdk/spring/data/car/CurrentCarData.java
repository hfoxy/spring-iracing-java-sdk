package me.hfox.iracing.sdk.spring.data.car;

import me.hfox.iracing.sdk.spring.yaml.file.speed.Speed;

public class CurrentCarData {

    private final int gear;
    private final Speed speed;

    public CurrentCarData(int gear, Speed speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public static class Builder {

        private int gear;
        private Speed speed;

        public int getGear() {
            return gear;
        }

        public Builder withGear(int gear) {
            this.gear = gear;
            return this;
        }

        public Speed getSpeed() {
            return speed;
        }

        public Builder withSpeed(Speed speed) {
            this.speed = speed;
            return this;
        }

    }

}
