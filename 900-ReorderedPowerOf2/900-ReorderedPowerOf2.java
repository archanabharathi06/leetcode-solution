// Last updated: 8/12/2026, 11:14:00 AM
class Solution {
    public boolean reorderedPowerOf2(int n) {
        int count=count(n);
        for(int i=0;i<31;i++){
            if(count==count(1<<i)) return true;
        }
        return false;
    }
    private int count(int n){
        int c=0;
        while(n>0){
            c+=(int)Math.pow(10,n%10);
            n=n/10;
        }
        return c;
    }
}