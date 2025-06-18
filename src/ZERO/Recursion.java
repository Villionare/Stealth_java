package ZERO;
import java.util.regex.*;

public class Recursion {


    public static int findReverse(int num, int temp) {
        // Base case: when num becomes 0, return the reversed number (temp)
        if (num == 0) {
            return temp;
        }

        // Recursive step: multiply temp by 10 and add the last digit of num
        return findReverse(num / 10, (temp * 10) + (num % 10));
    }

    public static void main(String... args){
        int num = 12321;
        int reverseNum = findReverse(num,0);
        if(num == reverseNum)
            System.out.println(num +" is a palindrome!");
        else
            System.out.println(num +" is not a palindrome!");
    }

//    public static void main(String[] args) {
//        System.out.println(factorial(5));
//    }


}
