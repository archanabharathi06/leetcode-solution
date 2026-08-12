// Last updated: 8/12/2026, 11:15:20 AM
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if((target+sum)%2!=0 || Math.abs(target)>sum){
            return 0;
        }
        int s=(target+sum)/2;
        int dp[]=new int[s+1];
        dp[0]=1;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            for(int j=s;j>=num;j--){
                dp[j]+=dp[j-num];
            }
        }
        return dp[s];
    }
}