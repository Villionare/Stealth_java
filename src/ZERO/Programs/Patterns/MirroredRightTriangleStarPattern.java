package ZERO.Programs.Patterns;
import java.util.Scanner;

public class MirroredRightTriangleStarPattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scanner.nextInt();

        int patt = 0;
        for (int i = row; i >= 0; i--){
            for (int j = i; j >= 0; j--){
                System.out.print("  ");
            }
            for (int k = 0; k <= patt; k++){
                System.out.print("* ");
            }
            patt++;
            System.out.print("\n");
        }
    }
}
