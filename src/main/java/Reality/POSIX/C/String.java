package Reality.POSIX.C;

public class String {

    private String() {

    }

    public static native void memcpy(long Destination, long Source, long Size);
    public static native void memmove(long Destination, long Source, long Size);
    public static native void memcmp(long FirstPointer, long SecondPointer, long Size);
    public static native void memset(long Address, int Value, long Size);
    public static native void strcmp(long FirstString, long SecondString);

}
