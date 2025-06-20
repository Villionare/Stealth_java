package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    //Stream is a flow of data, like a sequence of bytes, from a source to a destination.
    //there are 2 types of io streams in java
    //Byte streams and Character streams
    //Byte streams - input stream classes & output stream classes
    //Character streams - Reader Classes & Writer Classes

    public static void main(String[] args) throws IOException {
//        InputStream IS = new InputStream();
//        File file = new File("first.txt");

        File first = new File("src\\FileHandling\\third.txt");
        System.out.println(first.canRead());
        System.out.println(first.canWrite());
        System.out.println(first.exists());
        System.out.println(first.getName());
        System.out.println(first.getAbsolutePath());
        System.out.println(first.getAbsolutePath());
        System.out.println(first.length());
        System.out.println(first.mkdir());
        System.out.println(first.createNewFile());


        FileWriter fw = new FileWriter("src\\FileHandling\\first.txt");
        fw.append("this is the Appended text");

        FileReader fr = new FileReader("src\\FileHandling\\first.txt");
        System.out.println(fr.read());

        fr.close();
        fw.close();
    }
}
