public class problem_3 {
        // Approach 1: Using two passes with array (more space efficient)
        public static char findFirstNonRepeatingChar(String str) {
            // Create count array for all possible characters
            int[] charCount = new int[256]; // Assuming ASCII characters

            // Count frequency of each character
            for (char c : str.toCharArray()) {
                charCount[c]++;
            }

            // Find first character with count 1
            for (char c : str.toCharArray()) {
                if (charCount[c] == 1) {
                    return c;
                }
            }

            return '\0'; // Return null character if no non-repeating character found
        }

        // Approach 2: Using LinkedHashMap (preserves insertion order)
        public static char findFirstNonRepeatingCharUsingMap(String str) {
            java.util.Map<Character, Integer> charCount = new java.util.LinkedHashMap<>();

            // Count frequency of each character
            for (char c : str.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            // Find first character with count 1
            for (java.util.Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return '\0';
        }

        public static void main(String[] args) {
            // Test cases
            String[] tests = {
                    "leetcode",      // Expected: 'l'
                    "loveleetcode", // Expected: 'v'
                    "aabb",        // Expected: '\0'
                    "",           // Expected: '\0'
                    "aaa",       // Expected: '\0'
                    "abcabcd"   // Expected: 'd'
            };

            System.out.println("Using Array Approach:");
            for (String test : tests) {
                char result = findFirstNonRepeatingChar(test);
                System.out.printf("Input: \"%s\" -> First non-repeating: '%c'%n",
                        test, result == '\0' ? ' ' : result);
            }

            System.out.println("\nUsing LinkedHashMap Approach:");
            for (String test : tests) {
                char result = findFirstNonRepeatingCharUsingMap(test);
                System.out.printf("Input: \"%s\" -> First non-repeating: '%c'%n",
                        test, result == '\0' ? ' ' : result);
            }
        }
}

