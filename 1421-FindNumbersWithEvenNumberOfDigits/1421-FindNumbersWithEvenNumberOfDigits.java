// Last updated: 8/12/2026, 11:12:46 AM
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int digit=0;
            while(num>0){
                num/=10;
                digit++;
            }
            if(digit%2==0){
                c++;
            }
        }
        return c;
    }
}