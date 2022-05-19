package me.hfox.iracing.sdk.spring.windows;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.*;
import com.sun.jna.platform.win32.WinNT.HANDLE;
import org.springframework.stereotype.Service;

@Service
public class WindowsService {

    private int lastError = 0;

    public WinNT.HANDLE openMemoryMapFile(String filename) {
        WinNT.HANDLE memMapFile = Kernel32Impl.KERNEL_32.OpenFileMapping(WinNT.SECTION_MAP_READ, false, filename);
        lastError = Kernel32Impl.KERNEL_32.GetLastError();

        return memMapFile;
    }

    public void closeHandle(HANDLE memMapFile) {
        Kernel32Impl.KERNEL_32.CloseHandle(memMapFile);
    }

    public Pointer mapViewOfFile(WinNT.HANDLE handle) {
        if (handle == null) {
            return null;
        }
        return Kernel32.INSTANCE.MapViewOfFile(handle, WinNT.SECTION_MAP_READ, 0, 0, 0);
    }

    public void unmapViewOfFile(Pointer sharedMemory) {
        Kernel32Impl.KERNEL_32.UnmapViewOfFile(sharedMemory);
        lastError = Kernel32Impl.KERNEL_32.GetLastError();
    }

    public void waitForSingleObject(WinNT.HANDLE handle, int timeout) {
        if (handle != null) {
            Kernel32.INSTANCE.WaitForSingleObject(handle, timeout);
            lastError = Kernel32.INSTANCE.GetLastError();
        }
    }

    public WinNT.HANDLE openEvent(String eventName) {
        WinNT.HANDLE handle = Kernel32Impl.KERNEL_32.OpenEvent(WinNT.SYNCHRONIZE, false, eventName);
        lastError = Kernel32.INSTANCE.GetLastError();
        return handle;
    }

    public int registerWindowMessage(final String lpString) {
        final int messageId = User32.INSTANCE.RegisterWindowMessage(lpString);
        if (messageId == 0) {
            throw new Win32Exception(Kernel32.INSTANCE.GetLastError());
        }
        return messageId;
    }

    public boolean sendNotifyMessage(int msg, int wParam, int lParam) {
        if (msg != 0) {
            boolean sent = User32Impl.USER_32.SendNotifyMessage(User32.HWND_BROADCAST,
                                                                msg,
                                                                new WinDef.WPARAM(wParam).intValue(),
                                                                new WinDef.LPARAM(lParam).intValue());
            lastError = Kernel32.INSTANCE.GetLastError();
            return sent;
        }
        return false;
    }

    /**
     * C++ MAKELONG for Java
     */
    public int MAKELONG(int lowWord, int highWord) {
        return ((highWord << 16) & 0xFFFF0000) | lowWord;
    }

    public int getLastError() {
        return lastError;
    }

    public void setLastError(int lastError) {
        this.lastError = lastError;
    }

}
