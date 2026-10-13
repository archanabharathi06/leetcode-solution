// Last updated: 10/13/2026, 2:27:37 PM
1class Solution {
2    public int jump(int[] nums) {
3        int end=0;
4        int jump=0;
5        int far=0;
6        for(int i=0;i<nums.length-1;i++){
7            far=Math.max(far,i+nums[i]);
8            if(i==end){
9                jump++;
10                end=far;
11            }
12        }
13        return jump;
14    }
15}