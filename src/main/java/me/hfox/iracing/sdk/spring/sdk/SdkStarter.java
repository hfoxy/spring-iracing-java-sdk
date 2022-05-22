package me.hfox.iracing.sdk.spring.sdk;

public interface SdkStarter {

    boolean isRunning();

    void fetchVars();

    boolean getVarBoolean(String varName);

    boolean getVarBoolean(String varName, int entry);

    int getVarInt(String varName);

    int getVarInt(String varName, int entry);

    float getVarFloat(String varName);

    float getVarFloat(String varName, int entry);

    double getVarDouble(String varName);

    double getVarDouble(String varName, int entry);

    Header getHeader();

}
