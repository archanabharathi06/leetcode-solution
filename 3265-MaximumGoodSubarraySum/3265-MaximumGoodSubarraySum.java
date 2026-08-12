// Last updated: 8/12/2026, 11:10:11 AM
import java.util.*;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Long> map = new HashMap<>();
        long sum = 0;
        long max = Long.MIN_VALUE;
        for (int num : nums) {
            if (map.containsKey(num - k)) {
                max = Math.max(max, sum + num - map.get(num - k));
            }
            if (map.containsKey(num + k)) {
                max = Math.max(max, sum + num - map.get(num + k));
            }
            map.put(num, Math.min(map.getOrDefault(num, Long.MAX_VALUE), sum));
            sum += num;
        }
        if (max == Long.MIN_VALUE) {
            return 0;
        }
        return max;
    }
}