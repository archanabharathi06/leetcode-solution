// Last updated: 8/14/2026, 12:27:23 PM
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int arr[] =new int[n];
6        int parent[]=new int[n];
7        int max=1;
8        int index=0;
9        for(int i=0;i<n;i++){
10            arr[i]=1;
11            parent[i]=-1;
12            for(int j=0;j<i;j++){
13                if(nums[i]%nums[j]==0){
14                    if(arr[j]+1>arr[i]){
15                    arr[i]=arr[j]+1;
16                    parent[i]=j;
17                    }
18                }
19            }
20            if(arr[i]>max){
21                max=arr[i];
22                index=i;
23            }
24        }
25        List<Integer> ans=new ArrayList<>();
26        while(index!=-1){
27            ans.add(nums[index]);
28            index=parent[index];
29        }
30        return ans;
31    }
32}