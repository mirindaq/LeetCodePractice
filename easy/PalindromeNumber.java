package easy;

//Given an integer x, return true if x is a palindrome, and false otherwise.
public class PalindromeNumber {
//    public boolean isPalindrome(int x) {
//        String str = String.valueOf(x);
//        int l = 0;
//        int r = str.length() - 1;
//
//        while ( l < r ){
//            if ( str.charAt(l) != str.charAt(r) ){
//                return false;
//            }
//            l++;
//            r--;
//        }
//        return true;
//    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int temp = x;
        int reversed = 0;

        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        return x == reversed;
    }

    public static void main(String[] args) {

        System.out.println( new PalindromeNumber().isPalindrome(121));
    }

}
