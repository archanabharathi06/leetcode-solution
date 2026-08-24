// Last updated: 8/24/2026, 4:08:07 PM
1class Solution {
2    public double largestTriangleArea(int[][] points) {
3        double max=0;
4        for(int i=0;i<points.length;i++){
5            for(int j=i+1;j<points.length;j++){
6                for(int k=j+1;k<points.length;k++){
7                    double area=Math.abs(
8                        points[i][0]*(points[j][1]-points[k][1])+
9                        points[j][0]*(points[k][1]-points[i][1])+
10                        points[k][0]*(points[i][1]-points[j][1])
11                    )/2.0;
12                    max=Math.max(max,area);
13                }
14            }
15        }
16        return max;
17    }
18}