package medium;

import java.util.HashSet;
import java.util.Set;
//Given a string s, find the length of the longest substring without duplicate characters.
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for ( int i = 0; i < s.length(); i++){
          while ( set.contains(s.charAt(i)) ){
              set.remove(s.charAt(l));
              l++;
          }

          set.add(s.charAt(i));
          max = Math.max(max, set.size());

        }
        return max;
    }


    public static void main(String[] args) {

        System.out.println( new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbabb"));

    }
}
