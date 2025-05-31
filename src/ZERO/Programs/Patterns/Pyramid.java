package ZERO.Programs.Patterns;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        int row = 7;
        for (int i = 1; i<=row; i++){

            //spaces
            for (int j = row; j > i; j--){
                System.out.print("  ");
            }

            //star
            for (int k = 1; k <= (2*i -1); k++ ){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}