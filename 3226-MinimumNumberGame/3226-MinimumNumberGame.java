// Last updated: 8/12/2026, 11:10:17 AM
class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(nums[i]<nums[j]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
        }
        int arr[]=new int[n];
        for(int i=0;i<n;i+=2){
            arr[i]=nums[i+1];
            arr[i+1]=nums[i];
        }
        return arr;
    }
}