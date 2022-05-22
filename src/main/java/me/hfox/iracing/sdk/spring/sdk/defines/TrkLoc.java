package me.hfox.iracing.sdk.spring.sdk.defines;

import javax.validation.constraints.NotNull;

public enum TrkLoc {

    irsdk_NotInWorld(-1),
    irsdk_OffTrack(0),
    irsdk_InPitStall(1),
    irsdk_AproachingPits(2),
    irsdk_OnTrack(3),
    ;

    private final int value;

    TrkLoc(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @NotNull
    public static String valueOf(int value) {
        return objectFor(value).toString();
    }

    @NotNull
    public static TrkLoc objectFor(int value) {
        for (TrkLoc t : TrkLoc.values()) {
            if (t.value == value) {
                return t;
            }
        }

        return irsdk_NotInWorld;
    }

}
