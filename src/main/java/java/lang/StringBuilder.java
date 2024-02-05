package java.lang;

public class StringBuilder {
    private char[] buffer;
    private int characterCount;

    public StringBuilder() {
        this.buffer = new char[15];
        this.characterCount = 0;
    }

    public StringBuilder(int length) {
        this.buffer = new char[length];
        this.characterCount = 0;
    }

    public StringBuilder(String value) {
        this.buffer = new char[value.length()];
        for (int i = 0; i < value.length(); i++) {
            this.buffer[i] = value.charAt(i);
        }
        this.characterCount = buffer.length;
    }

    public int length() {
        return characterCount;
    }

    public int capacity() {
        return buffer.length;
    }

    public StringBuilder append(String str) {
        if (buffer.length - (str.length() + characterCount) < 0) {
            char[] newBuffer = new char[this.buffer.length + str.length()];
            for (int i = 0; i < this.buffer.length; i++) {
                newBuffer[i] = this.buffer[i];
            }
            this.buffer = newBuffer;
        }
        for (int i = 0; i < str.length(); i++) {
            this.buffer[characterCount] = str.charAt(i);
            characterCount++;
        }
        return this;
    }

    public StringBuilder append(char[] str) {
        if (buffer.length - (str.length + characterCount) < 0) {
            char[] newBuffer = new char[this.buffer.length + str.length];
            for (int i = 0; i < this.buffer.length; i++) {
                newBuffer[i] = this.buffer[i];
            }
            this.buffer = newBuffer;
        }
        for (int i = 0; i < str.length; i++) {
            this.buffer[characterCount] = str[i];
            characterCount++;
        }
        return this;
    }

    public String toString() {
        return new String(buffer);
    }
}