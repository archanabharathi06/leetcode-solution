// Last updated: 8/12/2026, 11:15:39 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1)){
                res.add(i+1);
            }
        }
        return res;
    }
}