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

//        try{
//            FileReader fr = new FileReader("src\\FileHandling\\START.json");
//            Scanner scanner = new Scanner(fr);
//             while (scanner.hasNextLine()){
//                 String data = scanner.nextLine();
//                 System.out.println(data);
//             }
//             scanner.close();
//             fr.close();
//        } catch (IOException e){
//            System.out.println(e);
//        }

//        FileWriter fw = new FileWriter("src\\FileHandling\\first.txt");
//        fw.append("this is the Appended text");
//
//        FileReader fr = new FileReader("src\\FileHandling\\first.txt");
//        System.out.println(fr.read());
//
//        fr.close();
//        fw.close();

        File file = new File("src\\FileHandling\\START.json");
        File file1 = new File("src\\FileHandling\\Task.json");

        if(file.exists()){
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Length: " + file.length());
            System.out.println("Can Read?: " + file.canRead());
            System.out.println("Can Write?: " + file.canWrite());
            System.out.println("Get Parent: " + file.getParent());
            System.out.println("Comparing with Task.json: " + file.compareTo(file1));
        } else {
            System.out.println("File does not exists!");
        }
    }
}