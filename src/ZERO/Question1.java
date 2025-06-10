package ZERO;

import ZERO.abstraction.Main;

import java.util.Random;

public class Question1 {

    public static void main(String[] args) {

        Random random = new Random();
        int sum = 0;
        int[] a = new int[10];

        for(int i = 0; i < 10; i++){
            a[i] = random.nextInt(1, 101);
            System.out.print(a[i]+ ",");
        }
        System.out.println(" ");
        System.out.print("so the sum of all the Elements in the Array: ");

        for (int j : a) {
            sum += j;
        }

        System.out.print(sum);
        System.out.println(" ");

        int max = a[0];
        for (int i = 0; i<a.length; i++){
            if(a[i]>=max){
                max = a[i];
            }
        }

        System.out.println("Also the Largest Element in the Array is: " + max);

    }
}
