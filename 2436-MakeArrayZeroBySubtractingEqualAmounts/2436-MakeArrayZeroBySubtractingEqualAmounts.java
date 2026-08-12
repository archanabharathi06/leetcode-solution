// Last updated: 8/12/2026, 11:11:14 AM
class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                c++;
                int val=nums[i];
                for(int j=1;j<nums.length;j++){
                    nums[j]-=val;
                }
            }
        }
        return c;
    }
}