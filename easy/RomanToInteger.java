package easy;

import java.util.HashMap;
import java.util.Map;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//        Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//For example, 2 is written as II in Roman numeral, just two ones added together.
//12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
public class RomanToInteger {
//    public static int romanToInt(String s) {
//        int ans = 0;
//
//        for ( int i = 0 ; i < s.length(); i++ ){
//            if ( i + 1 < s.length() && getValFromKey(s.charAt(i+1)) > getValFromKey(s.charAt(i)))
//                ans -= getValFromKey(s.charAt(i));
//            else ans += getValFromKey(s.charAt(i));
//        }
//        return ans;
//    }
//
//    private static int getValFromKey( Character key ){
//        return switch (key) {
//            case 'I' -> 1;
//            case 'V' -> 5;
//            case 'X' -> 10;
//            case 'L' -> 50;
//            case 'C' -> 100;
//            case 'D' -> 500;
//            case 'M' -> 1000;
//            default -> 0;
//        };
//    }

    public static int value(char c){
        if(c=='I') return 1;
        else if(c=='V') return 5;
        else if(c=='X') return 10;
        else if(c=='L') return 50;
        else if(c=='C') return 100;
        else if(c=='D') return 500;
        return 1000;
    }
    public static int romanToInt(String s) {
        int n=s.length();
        int sum=0;
        int prev=-1;
        for(int i=n-1;i>=0;i--){
            int curr=value(s.charAt(i));

            if(prev!=-1 && curr<prev){
                sum-=curr;
            }else{
                sum+=curr;
            }
            prev=curr;
        }

        return sum;

    }



    public static void main(String[] args) {
        System.out.println( romanToInt("IV"));
    }
}
