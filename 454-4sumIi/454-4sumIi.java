// Last updated: 8/12/2026, 11:15:35 AM
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums1.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=nums1[i]+nums2[j];
                if(map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }else{
                    map.put(sum,1);
                }
            }
        }
        int c=0;
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                int sum=nums3[k]+nums4[l];
                if(map.containsKey(-sum)){
                    c+=map.get(-sum);
                }
            }
        }
        return c;
    }
}