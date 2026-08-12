// Last updated: 8/12/2026, 11:17:30 AM
class Solution {
    public int rob(int[] nums) {
        int p1=0;
        int p2=0;
        for(int i=0;i<nums.length;i++)
        {
            int temp=p1;
            p1=Math.max(p1,p2+nums[i]);
            p2=temp;
        }
        return p1;
    }
}