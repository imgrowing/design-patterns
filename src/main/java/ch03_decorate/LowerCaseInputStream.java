package ch03_decorate;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int read = super.read();
        return (read != -1) ? Character.toLowerCase((char) read) : read;
    }
}
