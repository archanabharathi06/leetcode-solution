// Last updated: 8/12/2026, 11:13:33 AM
class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3){
            return false;
        }
        int i=0;
        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
            return false;
        }
        while(i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        return i==n-1;
    }
}