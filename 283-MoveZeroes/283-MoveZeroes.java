// Last updated: 8/12/2026, 11:16:46 AM
class Solution {
    public void moveZeroes(int[] nums) {
      int j=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
        }
      }
    }
}