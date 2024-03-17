package StringManipulation;

public class StringOperations {
    public static void main(String[] args) {
        String inputString = "This is a Sample String for Testing";

        // 1. Count the number of characters in the string (excluding whitespaces).
        int charCount = inputString.replaceAll("\\s", "").length();
        System.out.println("1. Number of characters (excluding whitespaces): " + charCount);

        // 2. Convert the string to uppercase.
        String upperCaseString = inputString.toUpperCase();
        System.out.println("2. Uppercase string: " + upperCaseString);

        // 3. Convert the string to lowercase.
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("3. Lowercase string: " + lowerCaseString);

        // 4. Check if the string starts with the letter 'A'.
        boolean startsWithA = inputString.startsWith("A");
        System.out.println("4. Starts with 'A': " + startsWithA);

        // 5. Check if the string ends with the letter 'Z'.
        boolean endsWithZ = inputString.endsWith("Z");
        System.out.println("5. Ends with 'Z': " + endsWithZ);

        // 6. Replace all occurrences of the letter 'e' with 'E'.
        String replacedString = inputString.replace("e", "E");
        System.out.println("6. String with 'e' replaced by 'E': " + replacedString);

        // 7. Split the string into an array of words using whitespaces as the delimiter.
        String[] wordsArray = inputString.split("\\s+");
        System.out.println("7. Words in the string:");
        for (String word : wordsArray) {
            System.out.println("   - " + word);
        }

        // 8. Find the index of the first occurrence of the letter 'o'.
        int indexOfO = inputString.indexOf('o');
        System.out.println("8. Index of the first 'o': " + indexOfO);

        // 9. Extract a substring from the 5th character to the 10th character (inclusive).
        String substring = inputString.substring(4, 10);
        System.out.println("9. Substring from 5th to 10th character: " + substring);

        // 10. Remove any leading or trailing whitespaces from the string.
        String trimmedString = inputString.trim();
        System.out.println("10. String with leading and trailing whitespaces removed: " + trimmedString);
    }
}
