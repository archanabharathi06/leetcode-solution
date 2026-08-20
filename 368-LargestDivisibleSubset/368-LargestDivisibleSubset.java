// Last updated: 8/20/2026, 6:23:49 PM
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int arr[] =new int[n];
        int parent[]=new int[n];
        int max=1;
        int index=0;
        for(int i=0;i<n;i++){
            arr[i]=1;
            parent[i]=-1;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(arr[j]+1>arr[i]){
                    arr[i]=arr[j]+1;
                    parent[i]=j;
                    }
                }
            }
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(index!=-1){
            ans.add(nums[index]);
            index=parent[index];
        }
        return ans;
    }
}