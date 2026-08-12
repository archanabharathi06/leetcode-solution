// Last updated: 8/12/2026, 11:10:41 AM
class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        Arrays.sort(nums);
        return nums[1];
    }
}