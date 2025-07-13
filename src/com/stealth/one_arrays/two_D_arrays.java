package com.stealth.one_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class two_D_arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] twoD = {
                {1,2,3,4,5,6},
                {3,6,34,56,7},
                {9,5,6,45}
        };

//        System.out.println(twoD.length);

        //taking input in 2D Array:
        for (int i=0; i<twoD.length; i++){
            for (int j=0;j<twoD[i].length;j++){
                System.out.printf("two[%d][%d] = ",i,j);
                twoD[i][j] = scanner.nextInt();
            }
        }
//my method of printing the array:
//        System.out.print("twoD");
//        for (int[] item: twoD){
//        System.out.print("[");
//            for (int item2 : item){
//                System.out.printf("%d,", item2);
//            }
//        System.out.println("]");
//        }
//        System.out.print("]");

        for (int row = 0; row<twoD.length;row++){
            for (int col=0; col<twoD[row].length;col++){
                System.out.print(twoD[row][col]);
            }
            System.out.println("");
        }

//this one using builtin methods:
//        for (int i = 0;i<twoD.length;i++){
//        System.out.println(Arrays.toString(twoD[i]));
//        }
    }
}
