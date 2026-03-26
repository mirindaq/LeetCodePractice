package easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < nums.length; i++ ){
            if ( map.containsKey(nums[i]) ) {
                int temp = Math.abs(map.get(nums[i]) - i);
                if ( temp <= k ){
                    return true;
                } else {
                    map.put(nums[i],i);
                }
            } else {
                map.put(nums[i], i );
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println( new ContainsNearbyDuplicate().containsNearbyDuplicate(nums, 3));

    }
}
