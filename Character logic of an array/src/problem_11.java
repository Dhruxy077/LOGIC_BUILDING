public class problem_11 {

    public static int countPS(String s) {
        int n = s.length();
        int count = 0;

        // Count palindromes with length >= 2
        for (int i = 0; i < n - 1; i++) {
            count += countPalindromesAroundCenter(s, i, i);
            count += countPalindromesAroundCenter(s, i, i + 1);
        }
        return count;
    }

    private static int countPalindromesAroundCenter(String str, int left, int right) {
        int count = 0;


        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
           
            if (right > left) {
                count++;
            }
            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(countPS(str));
    }
}