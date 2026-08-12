// Last updated: 8/12/2026, 11:10:25 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int dig1=0;
        int dig2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                dig1+=i;
            }else{
                dig2+=i;
            }
        }
        return dig2-dig1;
    }
}