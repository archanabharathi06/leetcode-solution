// Last updated: 8/12/2026, 11:17:45 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
              }  
            }
        }
        return new int[]{-1,-1};
    }
}