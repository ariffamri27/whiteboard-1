import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P6Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        Pair result = findMaxOccurrenceCharacter(input);
        System.out.println("Character: '" + result.character + "', Occurrence: " + result.occurrence);
    }

    // Define a class Pair to store character and its occurrence
    static class Pair {
        char character;
        int occurrence;

        Pair(char character, int occurrence) {
            this.character = character;
            this.occurrence = occurrence;
        }
    }

    /**
     * Function to find the character with the maximum occurrence in a string.
     *
     * @param input The input string
     * @return A Pair object containing the character with maximum occurrence and its count
     */
    public static Pair findMaxOccurrenceCharacter(String input) {
        // HashMap to store frequency of each character
        Map<Character, Integer> frequency = new HashMap<>();

        // Iterate through the input string to count frequencies
        for (char c : input.toCharArray()) {
            // Consider only Unicode letters (categories L and M)
            if (Character.isLetter(c)) {
                // Normalize the character to handle case insensitivity
                char normalizedChar = Character.toLowerCase(c);
                // Update frequency map
                frequency.put(normalizedChar, frequency.getOrDefault(normalizedChar, 0) + 1);
            }
        }

        // Find the character with maximum occurrence
        char maxChar = ' '; // Initialize with a space character
        int maxCount = 0; // Initialize with 0

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue(); // Update maxCount
                maxChar = entry.getKey(); // Update maxChar
            }
        }

        return new Pair(maxChar, maxCount); // Return the character with its occurrence count
    }
}
