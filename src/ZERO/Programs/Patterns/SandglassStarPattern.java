package ZERO.Programs.Patterns;

import java.util.Scanner;

public class SandglassStarPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j = 1; j<= i; j++){
                System.out.print("  ");
            }

            for (int k = i; k<=row; k++){
                System.out.print("* ");
            }

            for (int k = i; k<row; k++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= row; i++){
            for (int j = i; j<= row; j++){
                System.out.print("  ");
            }

            for (int k = 1; k<=i; k++){
                System.out.print("* ");
            }

            for (int l = 1; l<i; l++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
