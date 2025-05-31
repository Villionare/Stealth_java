package ZERO.Programs.Patterns;
import java.util.Scanner;

public class RightDownMirrorStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();

        for (int i = 1; i< row; i++){
            System.out.print(">");

            for (int j = 1; j<=i; j++){
                System.out.print(" ");
            }

            for (int k = (row-i); k>0; k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
