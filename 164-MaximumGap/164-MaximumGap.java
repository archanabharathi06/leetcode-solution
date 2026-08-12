// Last updated: 8/12/2026, 11:17:51 AM
class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int max=0;
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]-nums[i-1]);
        }
        return max;
    }
}