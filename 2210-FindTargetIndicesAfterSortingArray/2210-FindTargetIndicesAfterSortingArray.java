// Last updated: 8/12/2026, 11:11:38 AM
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res.add(i);
            }
        }
        return res;
    }
}