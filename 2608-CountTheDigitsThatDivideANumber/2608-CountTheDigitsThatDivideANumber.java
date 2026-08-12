// Last updated: 8/12/2026, 11:10:58 AM
class Solution {
    public int countDigits(int num) {
        int temp=num;
        int c=0;
        while(temp>0){
            int d=temp%10;
            temp/=10;
            if(num%d==0){
                c++;
            }
        }
        return c;
    }
}