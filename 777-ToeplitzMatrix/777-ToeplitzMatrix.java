// Last updated: 8/12/2026, 11:14:17 AM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]) return false;
                }
            }
        return true;
    }
}