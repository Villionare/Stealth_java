package ZERO.Programs.Patterns;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the no of rows: ");
        int rows = scanner.nextInt();

        for(int i = 1; i<=rows;i++){
            for (int j = 1;j <= i;j++ ){
                System.out.print("*");
            }

                System.out.print("\n");
        }
    scanner.close();
    }
}
