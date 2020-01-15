package hfdp.decorator.newio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream stream = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while((c = stream.read()) >= 0) {
                System.out.print((char)c);
            }
            stream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
