package me.hfox.iracing.sdk.spring.sdk.defines;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum VarType {
    // 1 byte
    irsdk_char(0), irsdk_bool(1),

    // 4 bytes
    irsdk_int(2), irsdk_bitField(3), irsdk_float(4),

    // 8 bytes
    irsdk_double(5),

    //index, don't use
    irsdk_ETCount(6);

    private static final Map<Integer, VarType> varTypeMap = new HashMap();

    static {
        for (VarType varType : EnumSet.allOf(VarType.class)) {
            varTypeMap.put(varType.type, varType);
        }
    }

    private final int type;

    VarType(int type) {
        this.type = type;
    }

    public static VarType get(int code) {
        return varTypeMap.get(code);
    }

    public int getType() {
        return type;
    }


}
