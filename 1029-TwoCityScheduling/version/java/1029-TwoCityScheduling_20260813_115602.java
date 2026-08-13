// Last updated: 8/13/2026, 11:56:02 AM
1class Solution {
2    public int twoCitySchedCost(int[][] costs) {
3        int n=costs.length/2;
4        int total=0;
5        for(int i=0;i<costs.length-1;i++){
6            for(int j=i+1;j<costs.length;j++){
7                int d1=costs[i][0]-costs[i][1];
8                int d2=costs[j][0]-costs[j][1];
9                if(d1<d2){
10                    int[] temp=costs[i];
11                    costs[i]=costs[j];
12                    costs[j]=temp;
13                }
14            }
15        }
16        for(int i=0;i<costs.length;i++){
17            if(i<n){
18                total+=costs[i][1];
19            }else{
20                total+=costs[i][0];
21            }
22        }
23        return total;
24    }
25}