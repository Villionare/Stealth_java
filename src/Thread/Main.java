package Thread;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Runnable thread0 = () -> {

            for (int i = 0; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                if (i == 5) {
                    System.out.println("Times up!");
                    System.exit(0);
                    //Program will exit with the status code 0
                }
            }
        };

        Thread t1 = new Thread(thread0);
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
