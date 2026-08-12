// Last updated: 8/12/2026, 11:09:51 AM
class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int res=nums[i];
            int sum=0;
            while(res>0){
                sum+=res%10;
                res/=10;
            }
            if(sum<min){
                min=sum;
            }
        }
        return min;
    }
}