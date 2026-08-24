// Last updated: 8/24/2026, 4:00:35 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n=nums.length;
4        int ans[]=new int[n];
5        for(int i=0;i<n;i++){
6            ans[i]=-1;
7            for(int j=1;j<n;j++){
8                int k=(i+j)% n;
9                if(nums[k]>nums[i]){
10                    ans[i]=nums[k];
11                    break;
12                }
13            }
14        }
15        return ans;
16    }
17}