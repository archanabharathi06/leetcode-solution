// Last updated: 9/22/2026, 10:06:11 AM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        int ans[]=new int[k];
8        for(int x=0;x<k;x++){
9            int max=0;
10            int value=0;
11            Object[] keys=map.keySet().toArray();
12            for(int i=0;i<keys.length;i++){
13                int num=(int) keys[i];
14                if(map.get(num)>max){
15                    max=map.get(num);
16                    value=num;
17                }
18            }
19            ans[x]=value;
20            map.put(value,0);
21        }
22        return ans;
23    }
24}