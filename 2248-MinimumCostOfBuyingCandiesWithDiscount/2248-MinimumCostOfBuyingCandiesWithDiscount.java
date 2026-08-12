// Last updated: 8/12/2026, 11:11:25 AM
class Solution {
    public int minimumCost(int[] cost) {
        int sum=0;
        Arrays.sort(cost);
        int n=cost.length;
        for(int i=n-1;i>=0;i--){
            if((n-1-i)%3!=2){
                sum+=cost[i];
            }
        }
        return sum;
    }
}