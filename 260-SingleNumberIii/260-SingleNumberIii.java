// Last updated: 8/24/2026, 4:30:03 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[2];
        int j=0;
        for(int num : map.keySet()){
            if(map.get(num)==1){
                ans[j]=num;
                j++;
            }
        }
        return ans;
    }
}