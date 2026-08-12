// Last updated: 8/12/2026, 11:16:43 AM
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for(int n : nums) {
            if(arr[n]) return n;
            else arr[n] = true;
        }
        return -1;
    }
}