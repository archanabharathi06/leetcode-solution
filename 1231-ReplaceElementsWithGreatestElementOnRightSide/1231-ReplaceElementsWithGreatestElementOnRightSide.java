// Last updated: 8/12/2026, 11:13:10 AM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=max;
            if(temp>max){
                max=temp;
            }
        }
        return arr;
    }
}