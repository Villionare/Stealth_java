package AlarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean con = true;
        LocalTime lt = null;
        String wavFilePath = "C:\\Users\\home4\\Intelli_java\\Stealth_JAVA\\src\\AlarmClock\\audio.wav";

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("This is a Alarm Clock!");

        while (lt == null){
            try {

                System.out.print("Enter the Time now (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                lt = LocalTime.parse(inputTime, dtf);
                System.out.println("Alarm is set for: " + lt);
            } catch (DateTimeParseException e){
                System.out.println("Invalid Time input");
            }

        }
            AlarmClock alarmClock = new AlarmClock(lt, wavFilePath);
            Thread thread0 = new Thread(alarmClock);
            thread0.start();

        scanner.close();
    }
}