// Last updated: 9/3/2026, 3:53:51 PM
1class Solution {
2    public boolean uniformArray(int[] nums) {
3
4        int min = nums[0];
5
6        for (int i = 1; i < nums.length; i++) {
7            min = Math.min(min, nums[i]);
8        }
9
10        if (min % 2 == 1)
11            return true;
12
13        for (int i = 0; i < nums.length; i++) {
14            if (nums[i] % 2 == 1)
15                return false;
16        }
17
18        return true;
19    }
20}