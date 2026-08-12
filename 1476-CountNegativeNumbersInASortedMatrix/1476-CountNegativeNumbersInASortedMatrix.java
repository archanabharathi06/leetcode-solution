// Last updated: 8/12/2026, 11:12:35 AM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    c++;
                }
            }
        }
        return c;
    }
}