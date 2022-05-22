package me.hfox.iracing.sdk.spring.sdk;

import com.joffrey.iracing.irsdkjava.model.defines.Constant;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class VarHeader {

    public static final int NUMBER_OF_FIELDS = 4;
    public static final int SIZEOF_FIELDS    = 4;
    public static final int VAR_HEADER_SIZE  =
            (NUMBER_OF_FIELDS * SIZEOF_FIELDS) + Constant.IRSDK_MAX_STRING + Constant.IRSDK_MAX_DESC + Constant.IRSDK_MAX_STRING;

    private int type;                                                 // irsdk_VarType
    private int offset;                                               // offset fron start of buffer row
    private int count;                                                // number of entrys (array)

    // so length in bytes would be irsdk_VarTypeBytes[type] * count
    private boolean countAsTime;
    private char[]  pad = new char[3];                                // (16 byte align)

    private String name;
    private String desc;
    private String unit;                                              // something like "kg/m^2"

    public VarHeader() {
    }

    public VarHeader(ByteBuffer buffer) {
        this(buffer, 0);
    }

    public VarHeader(ByteBuffer buffer, int varOffset) {
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        byte[] localBuffer;
        type = buffer.getInt(varOffset + 0);
        offset = buffer.getInt(varOffset + 4);
        count = buffer.getInt(varOffset + 8);

        localBuffer = new byte[Constant.IRSDK_MAX_STRING];
        buffer.position(varOffset + 16);
        buffer.get(localBuffer, 0, localBuffer.length);
        name = new String(localBuffer).replaceAll("[\000]", "");

        buffer.position(varOffset + 16 + Constant.IRSDK_MAX_STRING + Constant.IRSDK_MAX_DESC);
        buffer.get(localBuffer, 0, localBuffer.length);
        unit = new String(localBuffer).replaceAll("[\000]", "");

        localBuffer = new byte[Constant.IRSDK_MAX_DESC];
        buffer.position(varOffset + 16 + Constant.IRSDK_MAX_STRING);
        buffer.get(localBuffer, 0, localBuffer.length);
        desc = new String(localBuffer).replaceAll("[\000]", "");
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCountAsTime() {
        return countAsTime;
    }

    public void setCountAsTime(boolean countAsTime) {
        this.countAsTime = countAsTime;
    }

    public char[] getPad() {
        return pad;
    }

    public void setPad(char[] pad) {
        this.pad = pad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
