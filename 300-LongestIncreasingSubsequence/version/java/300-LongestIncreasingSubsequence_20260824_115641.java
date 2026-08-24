// Last updated: 8/24/2026, 11:56:41 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n=nums.length;
4        int arr[]=new int[n];
5        for(int i=0;i<n;i++){
6            arr[i]=1;
7        }
8        int max=1;
9        for(int i=0;i<n;i++){
10            for(int j=0;j<i;j++){
11                if(nums[j]<nums[i]){
12                    arr[i]=Math.max(arr[i],arr[j]+1);
13                }
14            }
15            max=Math.max(max,arr[i]);
16        }
17        return max;
18    }
19}