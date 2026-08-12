// Last updated: 8/12/2026, 11:13:29 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] res=new int[n];
        int left=0;
        int right=n-1;
        int index=n-1;
        while(left<=right){
            int lsqrt=nums[left]*nums[left];
            int rsqrt=nums[right]*nums[right];
            if(lsqrt>rsqrt){
                res[index--]=lsqrt;
                left++;
            }
            else{
                res[index--]=rsqrt;
                right--;
            }

        }
        return res;
    }
}