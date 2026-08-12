// Last updated: 8/12/2026, 11:12:58 AM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                c++;
                if(c==3){
                    return true;
                }
            }
            else{
                c=0;
            }
        }
        return false;
    }
}