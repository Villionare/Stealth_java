package ZERO.Programs.Patterns;
import java.util.Scanner;

//public class LeftTriangleStarPattern {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //i for rows and j for columns
////row denotes the number of rows you want to print
//        int i, j, row = 6;
////Outer loop work for rows
//        for (i=0; i<row; i++) {
////inner loop work for space
//            for (j = 2* (row - i); j >= 0; j--) {
////prints space between two stars
//                System.out.print(" ");
//            }
////inner loop for columns
//                for (j = 0; j <= i; j++) {
////prints star
//                System.out.print("* ");
//                }
////throws the cursor in a new line after printing each line
//            System.out.println();
//        }
//            scanner.close();
//    }
//
//}

public class LeftTriangleStarPattern {

    public static void main(String[] args) {

        System.out.print("Enter the no of rows: ");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();

        for (int i = 1; i <=row; i++){
                    for (int j= 1; j <= (row - i ); j++){
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++){
                        System.out.print("* ");
                    }
            System.out.print("\n");
        }
        scanner.close();
    }
}