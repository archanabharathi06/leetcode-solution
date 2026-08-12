// Last updated: 8/12/2026, 11:09:34 AM
class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            int x=nums[i];
            int c=0;
            for(int start=0;start<=n-k;start++){
                boolean found=false;
                for(int j=start;j<start+k;j++){
                    if(nums[j]==x){
                        found=true;
                        break;
                    }
                }
                if(found){
                    c++;
                }
            }
            if(c==1){
                ans=Math.max(ans,x);
            }
        }
        return ans;
    }
}