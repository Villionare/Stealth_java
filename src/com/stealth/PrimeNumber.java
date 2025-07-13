package com.stealth;

import java.util.Scanner;

public class PrimeNumber {
static boolean isPrime(int num){
    int n = 2;
    if (num<=1){
        return false;
    }else {

    while (n!=num){
        if (num%n==0){
            return false;
        }
        n++;
    }
    }
    return true;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int inpNum = scanner.nextInt();

        System.out.println(isPrime(inpNum));
    }
}