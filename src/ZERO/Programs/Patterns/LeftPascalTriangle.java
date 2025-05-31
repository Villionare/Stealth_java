package ZERO.Programs.Patterns;

import java.util.Scanner;

public class LeftPascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();

        for (int i = 1; i<=row; i++){
            //spaces
            for (int j =  (row - i); j > 0; j--){
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
             System.out.println();
        }

        for (int i = 1; i<=row; i++){
            //spaces
            for (int j =  1; j <= i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (row - i); k++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
}