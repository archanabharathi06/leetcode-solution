// Last updated: 8/12/2026, 11:16:57 AM
class Solution {
    public int addDigits(int num) {
        while(num>9){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            num=sum;
        }
        return num;
    }
}