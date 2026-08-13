// Last updated: 8/13/2026, 12:00:01 PM
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length/2;
        int total=0;
        for(int i=0;i<costs.length-1;i++){
            for(int j=i+1;j<costs.length;j++){
                int d1=costs[i][0]-costs[i][1];
                int d2=costs[j][0]-costs[j][1];
                if(d1<d2){
                    int[] temp=costs[i];
                    costs[i]=costs[j];
                    costs[j]=temp;
                }
            }
        }
        for(int i=0;i<costs.length;i++){
            if(i<n){
                total+=costs[i][1];
            }else{
                total+=costs[i][0];
            }
        }
        return total;
    }
}