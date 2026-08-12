// Last updated: 8/12/2026, 11:18:17 AM
class Solution {
    public int singleNumber(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            index=index^nums[i];
        }
        return index;
    }
}