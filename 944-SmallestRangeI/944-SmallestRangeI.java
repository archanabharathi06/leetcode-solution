// Last updated: 8/12/2026, 11:13:42 AM
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int res=max-min-2*k;
        if(res<0){
            return 0;
        }
        return res;
    }
}