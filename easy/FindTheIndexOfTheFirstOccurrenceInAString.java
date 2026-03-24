package easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {

//    public int strStr(String haystack, String needle) {
//        for ( int i = 0; i < haystack.length(); i++ ){
//            if ( haystack.startsWith(needle, i)){
//                return i;
//            }
//        }
//        return -1;
//    }

    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return (haystack.indexOf(needle));
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println( new FindTheIndexOfTheFirstOccurrenceInAString().strStr("hello", "ll"));
    }
}
