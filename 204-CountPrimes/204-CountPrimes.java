// Last updated: 8/12/2026, 11:17:22 AM
class Solution {
    public int countPrimes(int n) {
       boolean []p=new boolean[n];
        int c=0;
        for(int i=2;i<n;i++){
            p[i]=true;
        }
        for(int i=2;i<n;i++){
            if(p[i]){
                c++;
                for(int j=i*2;j<n;j+=i){
                    p[j]=false;
                }
            }
        }
        return c;
    }
}