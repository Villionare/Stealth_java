package ZERO.Programs.Patterns;

import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of Diamond: ");
        int row = scanner.nextInt();
        System.out.println("(note: length will be 2x)");
        for (int i = 1; i< row; i++){
            //spaces
            for (int j = row; j > i; j--){
                System.out.print(" ");
            }

            //patten
            for (int k = i; k < (2*i -1); k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for (int i = row; i> 1; i--){
            //spaces
            for (int j = i; j < row; j++){
                System.out.print(" ");
            }

            //patten
            for (int k = i; k < (2*i -1); k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
