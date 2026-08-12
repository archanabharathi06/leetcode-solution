// Last updated: 8/12/2026, 11:18:03 AM
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
                product*=nums[j];
                max=Math.max(max,product);
            }
        }
        return max;
    }
}