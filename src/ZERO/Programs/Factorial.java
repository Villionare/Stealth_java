package ZERO.Programs;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Programme to find the factorial of any number\nPlease enter any number: ");
        Scanner scanner = new Scanner(System.in);

        int no = scanner.nextInt();
        long temp = 1;
        for(int i = no; i >= 1; i--){
            temp = temp * i;
        }
        System.out.printf("%d! is %d",no,temp);
        scanner.close();
    }
}
