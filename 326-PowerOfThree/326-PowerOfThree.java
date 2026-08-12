// Last updated: 8/12/2026, 11:16:38 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n%3==0){
            n=n/3;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}