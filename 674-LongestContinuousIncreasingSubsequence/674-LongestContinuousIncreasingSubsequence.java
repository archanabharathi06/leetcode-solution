// Last updated: 8/12/2026, 11:14:32 AM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                c++;
                max=Math.max(max,c);
            }
            else{
                c=1;
            }
        }
        return max;
    }
}