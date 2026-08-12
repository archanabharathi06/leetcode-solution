// Last updated: 8/12/2026, 11:20:43 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            String temp="";
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(temp.indexOf(ch)!=-1){
                    break;
                }
                temp+=s.charAt(j);
                max=Math.max(max,temp.length());
            }
        }
        return max;
    }
}