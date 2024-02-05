package java.lang;

public class System {

    public static native void peekS(long Address, short value);

    public static native void peekB(long Address, byte value);

    public static native void peekI(long Address, int value);

    public static native void peekL(long Address, long value);

    public static native void print(String value);

    public static void println(String value) {
        print(value);
        print("\n");
    }

    public static void main(int y) {
        int x = 123;
        println("asdf"+y);
    }

}
