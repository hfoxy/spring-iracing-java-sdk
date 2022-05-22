package me.hfox.iracing.sdk.spring.sdk;

import com.sun.jna.Pointer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Header {

    public static final int HEADER_SIZE = 112; // All fields are int (4 bytes), there are 28 fields (28 * 4) = 112
    public final static int VARBUF_SIZE = 4 * 4;

    private Pointer    sharedMemory;
    private ByteBuffer byteBuffer;

    public Header(Pointer sharedMemory) {
        this.sharedMemory = sharedMemory;
    }

    public ByteBuffer getHeaderByteBuffer() {
        ByteBuffer headerByteBuffer = ByteBuffer.allocateDirect(HEADER_SIZE);
        headerByteBuffer.put(sharedMemory.getByteArray(0, Header.HEADER_SIZE));
        headerByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return headerByteBuffer;
    }

    public ByteBuffer getSessionInfoByteBuffer() {
        ByteBuffer sessionInfoByteBuffer =
                ByteBuffer.wrap(sharedMemory.getByteArray(getSessionInfoOffset(), getSessionInfoLen()));
        sessionInfoByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return sessionInfoByteBuffer;
    }

    public ByteBuffer getVarHeaderByteBuffer() {
        ByteBuffer varHeaderByteBuffer =
                ByteBuffer.wrap(sharedMemory.getByteArray(getVarHeaderOffset(), getNumVars() * HEADER_SIZE));
        varHeaderByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return varHeaderByteBuffer;
    }

    public ByteBuffer getVarByteBuffer(int idx) {
        ByteBuffer varHeaderByteBuffer = ByteBuffer.wrap(sharedMemory.getByteArray(getVarBuf_BufOffset(idx), getBufLen()));
        varHeaderByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return varHeaderByteBuffer;
    }

    public ByteBuffer getLatestVarByteBuffer() {
        ByteBuffer varHeaderByteBuffer =
                ByteBuffer.wrap(sharedMemory.getByteArray(getVarBuf_BufOffset(getLatestVarBuffIdx()), getBufLen()));
        varHeaderByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return varHeaderByteBuffer;
    }


    public int getVer() {
        return getHeaderByteBuffer().getInt(0);
    }

    public int getStatus() {
        return getHeaderByteBuffer().getInt(4);
    }

    public int getTickRate() {
        return getHeaderByteBuffer().getInt(8);
    }

    public int getSessionInfoUpdate() {
        return getHeaderByteBuffer().getInt(12);
    }

    public int getSessionInfoLen() {
        return getHeaderByteBuffer().getInt(16);
    }

    public int getSessionInfoOffset() {
        return getHeaderByteBuffer().getInt(20);
    }

    public int getNumVars() {
        return getHeaderByteBuffer().getInt(24);
    }

    public int getVarHeaderOffset() {
        return getHeaderByteBuffer().getInt(28);
    }

    public int getNumBuf() {
        return getHeaderByteBuffer().getInt(32);
    }

    public int getBufLen() {
        return getHeaderByteBuffer().getInt(36);
    }

    public int getVarBuf_TickCount(int varBuf) {
        return getSharedMemory().getInt((varBuf * VARBUF_SIZE) + 48);
    }

    public int getVarBuf_BufOffset(int varBuf) {
        return getSharedMemory().getInt((varBuf * VARBUF_SIZE) + 52);
    }

    private int getLatestVarBuffIdx() {
        int latest = 0;
        for (int i = 1; i < getNumBuf(); i++) {
            if (getVarBuf_TickCount(latest) < getVarBuf_TickCount(i)) {
                latest = i;
            }
        }
        return latest;
    }

    public Pointer getSharedMemory() {
        return sharedMemory;
    }

    public void setSharedMemory(Pointer sharedMemory) {
        this.sharedMemory = sharedMemory;
    }

    public ByteBuffer getByteBuffer() {
        return byteBuffer;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

}
