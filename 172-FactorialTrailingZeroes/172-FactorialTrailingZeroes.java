// Last updated: 8/12/2026, 11:17:38 AM
class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        while(n>0){
            n=n/5;
            c+=n;
        }
        return c;
    }
}