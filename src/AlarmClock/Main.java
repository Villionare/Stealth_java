package AlarmClock;

import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.Scanner;

class thread implements Runnable {
    int point;
    public thread(int a) {
    this.point = a;
    }

    @Override
    public void run() {
        for (int i = point; i>= 1; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("This is a alarm clock");
        System.out.println("type the time to get started.");
        int start = scanner.nextInt();
        Thread t1 = new Thread(new thread(start));
        t1.start();

        scanner.close();
    }
}
