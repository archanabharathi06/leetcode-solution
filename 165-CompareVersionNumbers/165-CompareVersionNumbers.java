// Last updated: 8/12/2026, 11:17:47 AM
class Solution {
    public int compareVersion(String version1, String version2) {
        String a[]=version1.split("\\.");
        String b[]=version2.split("\\.");
        int i=0;
        while(i<a.length || i<b.length){
            int n1=0;
            int n2=0;
            if(i<a.length){
                n1=Integer.parseInt(a[i]);
            }
            if(i<b.length){
                n2=Integer.parseInt(b[i]);
            }
            if(n1>n2) return 1;
            if(n1<n2) return -1;
            i++;
        }
        return 0;
    }
}