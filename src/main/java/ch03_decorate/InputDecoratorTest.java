package ch03_decorate;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputDecoratorTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = null;

        try {
            in = new LowerCaseInputStreamDecorator(
                    new BufferedInputStream(
                            new FileInputStream("/Users/harry/etudes/df-patterns/src/main/java/ch03_decorate/test.txt")
                    )
            );

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
