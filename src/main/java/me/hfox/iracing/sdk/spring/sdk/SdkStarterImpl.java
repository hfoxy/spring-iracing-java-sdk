package me.hfox.iracing.sdk.spring.sdk;

import com.joffrey.iracing.irsdkjava.model.defines.StatusField;
import com.joffrey.iracing.irsdkjava.model.defines.VarTypeBytes;
import com.joffrey.iracing.irsdkjava.windows.WindowsService;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinNT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import static com.joffrey.iracing.irsdkjava.model.defines.Constant.IRSDK_DATAVALIDEVENTNAME;
import static com.joffrey.iracing.irsdkjava.model.defines.Constant.IRSDK_MEMMAPFILENAME;

@Service
@Profile("!mac")
public class SdkStarterImpl implements SdkStarter {

    private static final Logger LOGGER = LoggerFactory.getLogger(SdkStarterImpl.class);

    private final WindowsService windowsService;

    private final Map<String, VarHeader> vars = new HashMap<>();

    private WinNT.HANDLE memMapFile;
    private WinNT.HANDLE dataValidEvent;
    private Pointer sharedMemory;
    private Header header;
    private boolean isInitialized;
    private boolean wasConnected;

    public SdkStarterImpl(WindowsService windowsService) {
        this.windowsService = windowsService;
    }

    private boolean isReady() {
        if (!isInitialized) {
            // Try to open Memory Mapped File
            if (memMapFile == null) {
                memMapFile = windowsService.openMemoryMapFile(IRSDK_MEMMAPFILENAME);
            }

            if (memMapFile != null) {
                if (sharedMemory == null) {
                    sharedMemory = windowsService.mapViewOfFile(memMapFile);
                    header = new Header(sharedMemory);

                    if (header.getByteBuffer() == null) {
                        return false;
                    }

                }

                if (sharedMemory != null) {
                    if (dataValidEvent == null) {
                        dataValidEvent =
                                windowsService.openEvent(IRSDK_DATAVALIDEVENTNAME);
                    }
                }

                if (dataValidEvent != null) {
                    isInitialized = true;
                    return true;
                }

                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public synchronized boolean isRunning() {
        boolean isConnected;

        if (isReady()) {
            isConnected = (header.getStatus() & StatusField.IRSDK_STCONNECTED.getValue()) > 0;
        } else {
            isConnected = false;
        }

        // keep track of connection status
        if (wasConnected != isConnected) {
            if (isConnected) {
                LOGGER.info("Connected to iRacing.");
                fetchVars();
            } else {
                LOGGER.info("Lost connection to iRacing");
            }
            //****Note, put your connection handling here
            wasConnected = isConnected;
        }

        return isConnected;
    }

    @Override
    public void fetchVars() {
        for (int index = 0; index < header.getNumVars(); index++) {
            VarHeader vh = getVarHeaderEntry(index);
            vars.put(vh.getName(), vh);
        }
    }

    private VarHeader getVarHeaderEntry(int index) {
        return new VarHeader(ByteBuffer.wrap(sharedMemory.getByteArray(header.getVarHeaderOffset() + (VarHeader.VAR_HEADER_SIZE
                        * index),
                VarHeader.VAR_HEADER_SIZE)));
    }

    @Override
    public boolean getVarBoolean(String varName) {
        return getVarBoolean(varName, 0);
    }

    @Override
    public boolean getVarBoolean(String varName, int entry) {
        VarHeader varHeader = vars.get(varName);
        if (varHeader != null) {
            if (entry >= 0 && entry < varHeader.getCount()) {
                return (header.getLatestVarByteBuffer()
                        .getChar(varHeader.getOffset() + (entry * VarTypeBytes.IRSDK_BOOL.getValue()))) != 0;
            }
        }
        return false;
    }

    @Override
    public int getVarInt(String varName) {
        return getVarInt(varName, 0);
    }

    @Override
    public int getVarInt(String varName, int entry) {
        VarHeader vh = vars.get(varName);
        if (vh != null) {
            if (entry >= 0 && entry < vh.getCount()) {
                return header.getLatestVarByteBuffer().getInt(vh.getOffset() + (entry * VarTypeBytes.IRSDK_INT.getValue()));
            }
        }
        return 0;
    }

    @Override
    public float getVarFloat(String varName) {
        return getVarFloat(varName, 0);
    }

    @Override
    public float getVarFloat(String varName, int entry) {

        VarHeader vh = vars.get(varName);
        if (vh != null) {
            if (entry >= 0 && entry < vh.getCount()) {
                return header.getLatestVarByteBuffer().getFloat(vh.getOffset() + (entry * VarTypeBytes.IRSDK_FLOAT.getValue()));
            }
        }
        return 0.0F;
    }

    @Override
    public double getVarDouble(String varName) {
        return getVarDouble(varName, 0);
    }

    @Override
    public double getVarDouble(String varName, int entry) {
        VarHeader vh = vars.get(varName);
        if (vh != null) {
            if (entry >= 0 && entry < vh.getCount()) {
                return header.getLatestVarByteBuffer().getDouble(vh.getOffset() + (entry * VarTypeBytes.IRSDK_DOUBLE.getValue()));

            }
        }
        return 0.0;
    }

    public Pointer getSharedMemory() {
        return sharedMemory;
    }

    public Header getHeader() {
        return header;
    }

}
