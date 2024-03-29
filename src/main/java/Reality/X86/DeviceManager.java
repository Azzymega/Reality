package Reality.X86;

public class DeviceManager {

    private static DeviceManager Manager;

    private DeviceManager() {

    }

    public static DeviceManager GetInstance() {

        if (Manager == null) {

            Manager = new DeviceManager();

        }

        return Manager;
    }

    public static native void IOWriteB(long Port, byte Data);
    public static native byte IOReadB(long Port);
    public static native void IOWriteS(long Port, short Data);
    public static native short IOReadS(long Port);
    public static native void IOWriteI(long Port, long Data);
    public static native long IOReadI(long Port);

}
