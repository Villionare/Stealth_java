package ZERO.Programs;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println("Programme to check armstrong number\nPlease enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int process = no;
        int temp = 0;
        int digit;
        int length = String.valueOf(no).length();

        while (process != 0){
            digit = process % 10;
            temp += Math.pow(digit,length);
            process /= 10;
        }


        if (temp == no ){
            System.out.println("Yes, " + no + " this is a armstrong number");
        } else {
            System.out.println("No, " + no + " this is not a armstrong number");
        }
        scanner.close();
    }
}
