package ZERO.Programs.Patterns;

import java.util.Scanner;

public class RightPascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();

        for (int i = 1; i<row; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row; i>=0; i--) {
            for (int k = row; k >= (row - i); k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
