package FileHandling;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.file.Files;

public class Another {
    public static void main(String[] args) {

        InputStream is = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        OutputStream os = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                System.out.println("this is a output stream");
            }
        };
    }
}
