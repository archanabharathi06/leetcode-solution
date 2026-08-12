// Last updated: 8/12/2026, 11:16:54 AM
class Solution {
    public boolean isUgly(int n) {
        for(int i=2;i<6 && n>0;i++){
            while(n%i==0){
                n/=i;
            }
        }
        return n==1;
    }
}