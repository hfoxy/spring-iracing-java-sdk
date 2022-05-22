package me.hfox.iracing.sdk.spring.sdk.defines;

public enum StatusField {

    IRSDK_STCONNECTED(1);

    private final int value;

    StatusField(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }
}
