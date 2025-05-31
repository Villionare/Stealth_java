package ZERO.Programs.Patterns;

import java.util.Scanner;

public class ReversePyramidStarPattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();
        int temp = 0;

        for(int i = row; i > 0; i--){

            for(int j = 0; j < temp; j++ ){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }

            temp++;
            System.out.println(" ");
        }
    }
}
