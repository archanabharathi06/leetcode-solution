// Last updated: 8/12/2026, 11:13:12 AM
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int k=n/4;
        for(int i=0;i<n-k;i++){
            if(arr[i]==arr[i+k]){
                return arr[i];
            }
        }
        return -1;
    }
}