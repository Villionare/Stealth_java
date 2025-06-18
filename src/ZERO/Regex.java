package ZERO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        String regex = "\\b[a-z]{3}\\b"; // Matches 3-letter words

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
