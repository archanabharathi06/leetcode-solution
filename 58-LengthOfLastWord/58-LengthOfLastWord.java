// Last updated: 8/12/2026, 11:19:34 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.stripTrailing();
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                return length;
            }
            length++;
        }
        return length;
    }
}