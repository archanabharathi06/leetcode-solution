// Last updated: 8/12/2026, 11:17:07 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int c=0;
            if(list.contains(nums[i])){
                continue;
            }
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>n/3){
                list.add(nums[i]);
            }
        }
        return list;
    }
}