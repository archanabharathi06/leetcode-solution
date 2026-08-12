// Last updated: 8/12/2026, 11:13:26 AM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> res=new ArrayList<>();
       for(int i=num.length-1;i>=0;i--){
        k=k+num[i];
        res.add(0,k%10);
        k/=10;
       }
       while(k>0){
        res.add(0,k%10);
        k/=10;
       }
       return res;
    }
}