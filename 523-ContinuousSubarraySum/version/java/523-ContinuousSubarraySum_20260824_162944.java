// Last updated: 8/24/2026, 4:29:44 PM
1import java.util.*;
2
3class Solution {
4    public boolean checkSubarraySum(int[] nums, int k) {
5        HashMap<Integer, Integer> map = new HashMap<>();
6        map.put(0,-1);
7        int sum=0;
8        for (int i=0;i<nums.length;i++) {
9            sum+=nums[i];
10            int rem=sum%k;
11            if (map.containsKey(rem)) {
12                if (i - map.get(rem)>=2) {
13                    return true;
14                }
15            } else {
16                map.put(rem,i);
17            }
18        }
19        return false;
20    }
21}