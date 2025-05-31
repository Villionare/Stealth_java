package ZERO.Programs;

import java.util.Scanner;

public class ReverseAnInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*enter any number to check if its palindrome*");
        int reversed = 0;
        int no = scanner.nextInt();

        while (no != 0){
            int digit = no % 10;
             reversed = reversed * 10 + digit;
            no /= 10;
        }
        System.out.println(reversed);
        scanner.close();
    }
}
