package ZERO.Programs.Patterns;
import java.util.Scanner;

public class A_alphabetStarPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of Diamond: ");
        int row = scanner.nextInt();

//        for (int y = 1; y<= row; y++){
//            for (int x = 1; x <= row; x++){
//                if (x==1 || x==5){
//                        System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        int i, j, n=8;
// Outer for loop for number of lines
        for (i = 0; i<=n; i++)
        {
// Inner for loop for logic execution
            for (j = 0; j<= n / 2; j++)
            {
// prints two vertical lines
                if ((j == 0 || j == n / 2) && i != 0 ||
// print first line of alphabet
                        i == 0  && j != n / 2 ||
// prints middle line
                        i == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}