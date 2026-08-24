// Last updated: 8/24/2026, 4:29:54 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        int max=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    arr[i]=Math.max(arr[i],arr[j]+1);
                }
            }
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}