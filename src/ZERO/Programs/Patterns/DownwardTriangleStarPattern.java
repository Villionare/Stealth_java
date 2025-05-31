package ZERO.Programs.Patterns;

import java.util.Scanner;

public class DownwardTriangleStarPattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();

        for (int i = row; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
