package ZERO.Programs;

import java.util.Scanner;

public class Palindrome {

    //direct method for palindrome check
//    public class PalindromeCheck {
//        public static boolean isPalindrome(String str) {
//            String reversed = new StringBuilder(str).reverse().toString();
//            return str.equals(reversed);
//        }
//
//        public static void main(String[] args) {
//            String input = "racecar";
//            System.out.println("Is palindrome? " + isPalindrome(input));
//        }
//    }

    private static boolean checkString(String word){
        int left = 0;
        int right = word.length() -1;
        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
                left++;
                right--;
        }
        return true;
    }

    private static void checkInteger(int number){
        int check_num = number;
        int reversed = 0;
        while (number != 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (check_num == reversed){
            System.out.println(check_num + " is a palindrome number");
        } else {
            System.out.println(check_num + " is not a palindrome number");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to palindrome checker");
        System.out.println("enter \n 1 - for Words \n 2 - Numbers");
        int inp = scanner.nextInt();
        scanner.nextLine();

        switch (inp){
            case 1 -> {
                System.out.print("Enter any Word: ");
                String word = scanner.nextLine();
                System.out.println(checkString(word));
            }
            case 2 -> {
                System.out.print("Enter any Number: ");
                int number = scanner.nextInt();
                checkInteger(number);
            }
        };
        scanner.close();
    }
}
