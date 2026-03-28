package medium;

//Given a string s, return the longest palindromic substring in s.
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            String odd = expand(s, i, i);
            if (odd.length() > longest.length()) {
                longest = odd;
            }

            String even = expand(s, i, i + 1);
            if (even.length() > longest.length()) {
                longest = even;
            }
        }

        return longest;
    }

    private String expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println( new LongestPalindromicSubstring().longestPalindrome(s));
    }
}
