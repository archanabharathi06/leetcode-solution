// Last updated: 8/12/2026, 11:10:51 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int element=0;
        int digitsum=0;
        for(int i=0;i<nums.length;i++){
            element+=nums[i];
            int temp=nums[i];
            while(temp>0){
                digitsum+=temp%10;
                temp/=10;
            }
        }
        return element-digitsum;
    }
}