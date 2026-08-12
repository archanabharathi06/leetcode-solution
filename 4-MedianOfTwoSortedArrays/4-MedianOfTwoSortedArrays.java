// Last updated: 8/12/2026, 11:20:42 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sa=nums1.length+nums2.length;
        int[] arr=new int[sa];
        int n=0;
        for(int i=0;i<nums1.length;i++)
        arr[n++]=nums1[i];
        
        for(int i=0;i<nums2.length;i++)
        arr[n++]=nums2[i];
        Arrays.sort(arr);

        if(arr.length%2!=0)
        return arr[arr.length/2];
        else
        return ((float)(arr[arr.length/2]+arr[(arr.length-1)/2])/2.0);
    }
}