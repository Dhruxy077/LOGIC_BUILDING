public class ManacherAlgorithm {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        // Step 1: Transform the input string
        // Add special characters to handle both odd and even length palindromes
        String transformed = transformString(s);

        // Step 2: Create array to store palindrome lengths
        int[] palindromeLengths = new int[transformed.length()];

        // Initialize variables for tracking
        int center = 0;      // Current center of palindrome
        int radius = 0;      // Right boundary of current palindrome

        // Step 3: Main algorithm loop
        for (int i = 0; i < transformed.length(); i++) {
            // If we're within the current palindrome boundary
            if (i < radius) {
                // Get the mirror index across the center
                int mirror = 2 * center - i;

                // Use previously computed values when possible
                // But don't exceed the current palindrome boundary
                palindromeLengths[i] = Math.min(radius - i, palindromeLengths[mirror]);
            }

            // Attempt to expand palindrome centered at i
            int leftBound = i - (1 + palindromeLengths[i]);
            int rightBound = i + (1 + palindromeLengths[i]);

            // Expand as long as we stay in bounds and characters match
            while (leftBound >= 0 && rightBound < transformed.length() &&
                    transformed.charAt(leftBound) == transformed.charAt(rightBound)) {
                palindromeLengths[i]++;
                leftBound--;
                rightBound++;
            }

            // If we expanded beyond the current right boundary
            // Update center and radius
            if (i + palindromeLengths[i] > radius) {
                center = i;
                radius = i + palindromeLengths[i];
            }
        }

        // Step 4: Find the longest palindrome
        int maxLength = 0;
        int centerIndex = 0;

        for (int i = 0; i < transformed.length(); i++) {
            if (palindromeLengths[i] > maxLength) {
                maxLength = palindromeLengths[i];
                centerIndex = i;
            }
        }

        // Step 5: Convert back to original string coordinates
        return extractPalindrome(s, transformed, centerIndex, maxLength);
    }

    // Helper method to transform the input string
    private String transformString(String s) {
        StringBuilder transformed = new StringBuilder("^"); // Start boundary

        for (char c : s.toCharArray()) {
            transformed.append("#").append(c);
        }

        transformed.append("#$"); // End boundary
        return transformed.toString();
    }

    // Helper method to extract the palindrome from transformed coordinates
    private String extractPalindrome(String original, String transformed,
                                     int center, int length) {
        // Convert center position to original string coordinates
        int start = (center - length) / 2;
        int end = start + length;

        return original.substring(start, end);
    }

    // Test method to demonstrate usage
    public static void main(String[] args) {
        ManacherAlgorithm solution = new ManacherAlgorithm();

        String[] tests = {
                "babad",    // Expected: "bab" or "aba"
                "cbbd",     // Expected: "bb"
                "racecar",  // Expected: "racecar"
                "a",        // Expected: "a"
                "ac",       // Expected: "a" or "c"
                "babadada"  // Expected: "adada"
        };

        for (String test : tests) {
            System.out.println("Input: " + test);
            System.out.println("Longest palindrome: " + solution.longestPalindrome(test));
            System.out.println();
        }
    }
}