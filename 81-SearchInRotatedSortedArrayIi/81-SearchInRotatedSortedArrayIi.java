// Last updated: 8/12/2026, 11:19:02 AM
class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}