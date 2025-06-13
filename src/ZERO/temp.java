package ZERO;

public class temp {
    public static int findHighestOccurrence(String str) {
        int[] frequency = new int[256]; // Assuming ASCII characters

        int maxCount = 0;

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            frequency[ch]++;
            maxCount = Math.max(maxCount, frequency[ch]);
        }

        return maxCount; // Return the highest occurrence count
    }

    public static void main(String[] args) {
        String str = "success";
        System.out.println("Highest occurrence count: " + findHighestOccurrence(str));
        // Output: Highest occurrence count: 5
    }
}