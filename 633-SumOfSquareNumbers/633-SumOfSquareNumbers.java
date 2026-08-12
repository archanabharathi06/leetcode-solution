// Last updated: 8/12/2026, 11:14:47 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        long a=0;
        long b=(long)Math.sqrt(c);
        while(a<=b){
            long sum=a*a + b*b;
            if(sum==c){
                return true;
            }else if(sum<c){
                a++;
            }else{
                b--;
            }

        }
        return false;
    }
}