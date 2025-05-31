package ZERO.Programs;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter till how many Prime numbers to print:");
        int inp = scanner.nextInt();

        if (inp <= 1){
            System.out.println("no from one to negative infinity are not prime");
        } else {
            for(int i = 2; i <= inp; i++){
                boolean isPrime = true;
                for(int j = 2; j < i; j++){
                    if (i%j == 0){
                        isPrime = false;
                    }
                }
                if (isPrime){
                    System.out.println(i + " is a prime number");
                }
            }
        }
        scanner.close();
    }
}
