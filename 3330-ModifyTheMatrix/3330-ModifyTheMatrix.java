// Last updated: 8/12/2026, 11:09:58 AM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int j=0;j<n;j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<m;i++){
                if(matrix[i][j]!=-1){
                    max=Math.max(max,matrix[i][j]);
                }
            }
            for(int i=0;i<m;i++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=max;
                }
            }
        }
        return matrix;
    }
}