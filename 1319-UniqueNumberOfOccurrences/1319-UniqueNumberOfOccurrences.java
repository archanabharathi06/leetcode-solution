// Last updated: 8/12/2026, 11:12:50 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        int freq[]=new int[n];
        int size=0;
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found=true;
                    break;
                }
            }
            if(found) continue;
            int c=0;
            for(int k=0;k<n;k++){
                if(arr[i]==arr[k]){
                    c++;
                }
            }
            freq[size++]=c;
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(freq[i]==freq[j]){
                    return false;
                }
            }
        }
        return true;
    }
}