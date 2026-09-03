// Last updated: 9/3/2026, 3:59:45 PM
1class Solution {
2    public boolean uniformArray(int[] nums) {
3       int min=nums[0];
4       for(int i=1;i<nums.length;i++){
5        min=Math.min(min,nums[i]);
6       }
7       if(min%2==1){
8        return true;
9       }
10       for(int i=0;i<nums.length;i++){
11        if(nums[i]%2==1){
12            return false;
13        }
14       }
15       return true;
16    }
17}