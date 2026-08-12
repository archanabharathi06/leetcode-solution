// Last updated: 8/12/2026, 11:16:01 AM
class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int rotate=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            rotate+=i*nums[i];
        }
        int max=rotate;
        for(int k=1;k<n;k++){
            rotate=rotate+sum-n*nums[n-k];
            max=Math.max(max,rotate);
        }
        return max;
    }
}