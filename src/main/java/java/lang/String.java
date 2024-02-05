package java.lang;

public class String {
    private final char[] value;
    public String(char[] value) {
        this.value = value;
    }
    public String(String value) {
        this.value = value.value;
    }
    public int length() {
        return value.length;
    }
    public char charAt(int index) {
        return value[index];
    }
}
