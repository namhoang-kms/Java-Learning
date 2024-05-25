package java_examples.java_exercises;

public class WordCounter {

    public static void main(String[] args) {
        String input = "This is an   example of counting words in a string.    ";
        int numberOfWords = countWords(input);
        System.out.println("Number of words in the string: " + input.trim());
    }

    // Method to count the number of words in a string
    public static int countWords(String input) {
        // If the input string is null or empty, return 0
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Split the string into words using space as delimiter
        String[] words = input.split(" ");

        // Use a counter variable to count the number of words
        int count = 0;

        // Loop through each word and increment the counter
        for (String word : words) {
            // Check if the current word contains non-whitespace characters
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
