// Last updated: 8/12/2026, 11:14:54 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2){
            return false;
        }
        char[]a=s1.toCharArray();
        Arrays.sort(a);
        String sorted1=new String(a);
        for(int i=0;i<=n2-n1;i++){
            String sub=s2.substring(i,i+n1);
            char[]b=sub.toCharArray();
            Arrays.sort(b);
            String sorted2=new String(b);
            if(sorted1.equals(sorted2)){
                return true;
            }
        }
        return false;
    }
}