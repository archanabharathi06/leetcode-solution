// Last updated: 8/12/2026, 11:19:43 AM
class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double res=1;
        while(N>0){
            if(N%2==1){
                res*=x;
            }
            x*=x;
            N/=2;
        }
        return res;
    }
}