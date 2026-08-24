// Last updated: 8/24/2026, 4:29:20 PM
import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for (int i=0;i<nums.length;i++) {
            sum+=nums[i];
            int rem=sum%k;
            if (map.containsKey(rem)) {
                if (i - map.get(rem)>=2) {
                    return true;
                }
            } else {
                map.put(rem,i);
            }
        }
        return false;
    }
}