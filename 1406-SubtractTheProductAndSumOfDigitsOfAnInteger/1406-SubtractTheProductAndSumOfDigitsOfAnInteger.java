// Last updated: 8/12/2026, 11:12:47 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int sum=0;
        int product=1;
        while(temp>0){
            int d=temp%10;
            temp/=10;
            sum+=d;
            product*=d;
        }
        return product-sum;
    }
}