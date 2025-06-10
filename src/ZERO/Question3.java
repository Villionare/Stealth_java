package ZERO;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type any Sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("So, the total length of the string(including spaces) is: " + sentence.length());
        System.out.println("Sentence in uppercase: " + sentence.toUpperCase());
        System.out.println("Sentence in lowercase: " + sentence.toLowerCase());

        System.out.println("Enter any word to find the sentence: ");
        String find_word = scanner.nextLine();

        find_word = find_word.toLowerCase();
        System.out.println(sentence.toLowerCase().contains(find_word));

        System.out.println("Enter any word to Replace in the Sentence: ");
        String replace_word = scanner.nextLine();
        replace_word = replace_word.toLowerCase();

        System.out.println("Enter any new word to place in the Sentence: ");
        String new_word = scanner.nextLine();

        System.out.println(sentence.toLowerCase().replace(replace_word,new_word));
    }
}
