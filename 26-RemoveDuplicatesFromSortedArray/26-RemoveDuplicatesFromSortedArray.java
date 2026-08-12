// Last updated: 8/12/2026, 11:20:12 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = 1;
        for (int i = 1; i < nums.length; i++) { 
            if (nums[i] > nums[i - 1]) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
}
