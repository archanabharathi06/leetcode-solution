// Last updated: 8/12/2026, 11:14:20 AM
class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=-1;
        int secmax=-1;
        int index=-1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>max){
            secmax=max;
            max=nums[i];
            index=i;
           }
           else if(nums[i]>secmax){
            secmax=nums[i];
           }
        }
        if(max>=2*secmax){
            return index;
        }
        return -1;
    }
}