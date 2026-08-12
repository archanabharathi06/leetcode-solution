// Last updated: 8/12/2026, 11:10:28 AM
class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=i+1){
                return false;
            }
        }
        if(nums[nums.length-1]==nums.length-1){
            return true;
        }
        return false;
    }
}