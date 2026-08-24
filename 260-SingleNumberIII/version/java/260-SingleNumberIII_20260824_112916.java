// Last updated: 8/24/2026, 11:29:16 AM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        int ans[]=new int[2];
8        int j=0;
9        for(int num : map.keySet()){
10            if(map.get(num)==1){
11                ans[j]=num;
12                j++;
13            }
14        }
15        return ans;
16    }
17}