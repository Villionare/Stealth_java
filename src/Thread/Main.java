package Thread;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RunnableInterface runnableThread = new RunnableInterface();
        Thread t1 = new Thread(runnableThread);
        t1.setDaemon(true); //thread will be destroyed when the main thread will be over
        t1.start();

        System.out.println("You have 5 seconds to enter your name:");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
        //t1.join() - this will make the main thread 'main' wait till t1 gets executed
    }
}
