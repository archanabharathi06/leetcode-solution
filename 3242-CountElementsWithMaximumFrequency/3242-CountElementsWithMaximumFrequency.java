// Last updated: 8/12/2026, 11:10:12 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>max){
                max=c;
            }
        }
        int total=0;
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int k=0;k<i;k++){
                if(nums[k]==nums[i]){
                   found=true;
                   break;
                }
            }
            if(found){
                continue;
            }
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==max){
                total+=c;
            }
        }
        return total;
    }
}