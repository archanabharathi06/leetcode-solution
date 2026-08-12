// Last updated: 8/12/2026, 11:11:10 AM
class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans=-1;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int c=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        c++;
                    }
                }
                if(c>max || c==max && nums[i]<ans){
                    max=c;
                    ans=nums[i];
                }
            }
           
        }
         return ans;
    }
}