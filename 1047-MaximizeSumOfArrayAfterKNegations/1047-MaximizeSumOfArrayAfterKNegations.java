// Last updated: 8/12/2026, 11:13:23 AM
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum=0;
        int max=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length && k>0;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
            }
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<max){
                max=nums[i];
            }
        }
        if(k%2==1){
            sum=sum-2*max;
        }
        return sum;
    }
}