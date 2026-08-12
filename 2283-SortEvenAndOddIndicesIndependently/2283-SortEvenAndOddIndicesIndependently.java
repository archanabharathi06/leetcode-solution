// Last updated: 8/12/2026, 11:11:22 AM
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+2;j<n;j+=2){
                if(i%2==0 && nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                if(i%2!=0 && nums[i]<nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}