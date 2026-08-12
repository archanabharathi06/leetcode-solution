// Last updated: 8/12/2026, 11:12:00 AM
class Solution {
    public int arraySign(int[] nums) {
        double pro=1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            pro*=nums[i];
        }
        if(pro>0){
            return 1;
        }else if(pro<0){
            return -1;
        }
        return 0;
    }
}