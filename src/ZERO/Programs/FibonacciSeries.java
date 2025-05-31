package ZERO.Programs;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many fibonacci numbers to print:");
        int inp = scanner.nextInt();
        int no = 0;
        int[] No =new int[inp];

        for (int i = 0; i < inp; i++){
            if(i==0){
            No[i] = 0;
            continue;
            }

            if (i == 1){
                No[i] = 1;
                continue;
            }

            No[i] = No[i - 1] + No[i - 2];
        }

        for (int k: No){
            System.out.printf("%d,",k);
        }
        scanner.close();
    }
}
