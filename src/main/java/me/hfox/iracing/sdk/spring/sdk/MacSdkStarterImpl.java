package me.hfox.iracing.sdk.spring.sdk;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("mac")
public class MacSdkStarterImpl implements SdkStarter {

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public void fetchVars() {

    }

    @Override
    public boolean getVarBoolean(String varName) {
        return false;
    }

    @Override
    public boolean getVarBoolean(String varName, int entry) {
        return false;
    }

    @Override
    public int getVarInt(String varName) {
        return 0;
    }

    @Override
    public int getVarInt(String varName, int entry) {
        return 0;
    }

    @Override
    public float getVarFloat(String varName) {
        return 0;
    }

    @Override
    public float getVarFloat(String varName, int entry) {
        return 0;
    }

    @Override
    public double getVarDouble(String varName) {
        return 0;
    }

    @Override
    public double getVarDouble(String varName, int entry) {
        return 0;
    }

    @Override
    public Header getHeader() {
        return null;
    }

}
