// Last updated: 8/12/2026, 11:12:09 AM
class Solution {
    public int[] frequencySort(int[] nums) {
       int n=nums.length;
       int [] freq=new int [201];
       for(int i=0;i<n;i++){
        freq[nums[i]+100]++;
       }
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int fi=freq[nums[i]+100];
            int fj=freq[nums[j]+100];
            if(fi>fj){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            else if(fi==fj && nums[i]<nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
       }
       return nums;
    }
}