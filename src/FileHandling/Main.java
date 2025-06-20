package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    //Stream is a flow of data, like a sequence of bytes, from a source to a destination.
    //there are 2 types of io streams in java
    //Byte streams and Character streams
    //Byte streams - input stream classes & output stream classes
    //Character streams - Reader Classes & Writer Classes

    public static void main(String[] args) throws IOException {
//        InputStream IS = new InputStream();
//        File file = new File("first.txt");

        try{
            FileReader fr = new FileReader("src\\FileHandling\\START.json");
            Scanner scanner = new Scanner(fr);
             while (scanner.hasNextLine()){
                 String data = scanner.nextLine();
                 System.out.println(data);
             }
             scanner.close();
             fr.close();
        } catch (IOException e){
            System.out.println(e);
        }

//        FileWriter fw = new FileWriter("src\\FileHandling\\first.txt");
//        fw.append("this is the Appended text");
//
//        FileReader fr = new FileReader("src\\FileHandling\\first.txt");
//        System.out.println(fr.read());
//
//        fr.close();
//        fw.close();
    }
}
