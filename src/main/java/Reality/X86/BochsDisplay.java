package Reality.X86;

public class BochsDisplay {
    private int IODataPort;
    private int IOIndexPort;
    public BochsDisplay() {
        IOIndexPort = 0x01CE;
        IODataPort = 0x01CF;
    }
    public void WriteRegister(short Index, short Value) {
        DeviceManager.IOWriteS(IOIndexPort,Index);
        DeviceManager.IOWriteS(IODataPort,Value);
    }

    public void SetupMode(int Width, int Height, int BitDepth, boolean LinearFramebuffer, boolean ClearMemory) {
        WriteRegister((short) 4, (short) 0x00);
        WriteRegister((short) 1, (short) Width);
        WriteRegister((short) 2, (short) Height);
        WriteRegister((short) 3, (short) BitDepth);
        WriteRegister((short) 4, (short) (0x01 |
                        (LinearFramebuffer ? 0x40 : 0) |
                        (ClearMemory ? 0 : 0x80)));
    }

}
