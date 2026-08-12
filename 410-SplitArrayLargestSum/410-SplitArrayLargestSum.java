// Last updated: 8/12/2026, 11:15:58 AM
class Solution {
    public int splitArray(int[] nums, int k) {
       int low=Integer.MIN_VALUE;
       int high=0;
       for(int i=0;i<nums.length;i++){
        low=Math.max(low,nums[i]);
        high+=nums[i];
       }
       while(low<high){
        int mid=(low+high)/2;
        int s=0,sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                s++;
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
        }
        if(s<k){
            high=mid;
        }else{
            low=mid+1;
        }
       }
       return low;
    }
}