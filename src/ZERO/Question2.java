package ZERO;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the grade calculator\nPlease Enter your percentage: ");
        int percentage = (int) scanner.nextDouble();

        if (percentage > 100){
            System.out.println("Your Percentage Can't be greater than 100");
        } else if (percentage < 0) {
            System.out.println("Your Percentage Can't be negative");
        }else {
            if(percentage >= 90 ){
                System.out.println("Congrats! You have Secured A Grade");
            }else if(percentage >= 80 ){
                System.out.println("Congrats! You have Secured B Grade");
            }else if(percentage >= 70 ){
                System.out.println("Congrats! You have Secured C Grade");
            }else if(percentage >= 60 ){
                System.out.println("Congrats! You have Secured D Grade");
            }else{
                System.out.println("You have Secured F Grade");
            }
        }

    }
}
