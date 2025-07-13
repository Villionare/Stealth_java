package com.stealth;

public class ArmstrongNumbers {
    //printing all the 3 digit armstrong numbers:
    static boolean armstrongNumbers(int num){
        int remainder;
        int temp = num;
        int sum = 0;

        while (num!=0){
            remainder = num%10; //so this modulus doesn't care about the decimal quotient and
                                //it only cares about the remainder after the devision.
                                //when we devide 5%10 so the % just considers 0 instead 0.5
                                //and returns - remainder, which is still 5 (because nothing was subtracted)
                                //so 5%10 simply asks:
                                //“How much is left after subtracting 0 whole sets of 10 from 5?” → Answer: 5
            sum += remainder * remainder * remainder;
            num /= 10;
        }

        if (sum == temp){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing 3 digit armstrong numbers: ");

        int i = 100;
        while (i<= 999){
            boolean check = armstrongNumbers(i);
            if (check)
                System.out.println(i);
            i++;
        }
    }
}
