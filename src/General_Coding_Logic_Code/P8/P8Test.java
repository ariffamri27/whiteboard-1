import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P8Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        scanner.close();

        // Check if the two strings are anagrams
        boolean isAnagram = checkAnagram(str1, str2);

        // Output the result
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? \n" + isAnagram);
    }

    //Function to check if two strings are anagrams of each other.
    public static boolean checkAnagram(String str1, String str2) {
        // Normalize strings: convert to lowercase and remove whitespace and punctuation
        String normalizedStr1 = normalizeString(str1);
        String normalizedStr2 = normalizeString(str2);

        // If lengths are different after normalization, they can't be anagrams
        if (normalizedStr1.length() != normalizedStr2.length()) {
            return false;
        }

        // Frequency map to count characters in normalized strings
        Map<Character, Integer> frequency1 = buildFrequencyMap(normalizedStr1);
        Map<Character, Integer> frequency2 = buildFrequencyMap(normalizedStr2);

        // Compare frequency maps
        return frequency1.equals(frequency2);
    }

    //Helper function to normalize a string by converting to lowercase,
    //removing whitespace, and removing non-alphabetic characters.
    private static String normalizeString(String str) {
        // Convert to lowercase and replace all non-alphabetic characters with ""
        return str.toLowerCase().replaceAll("[^a-z]", "");
    }

    //Helper function to build a frequency map of characters in a string.
    private static Map<Character, Integer> buildFrequencyMap(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each character in the string
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }
}
