// Last updated: 8/12/2026, 11:18:24 AM
class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str+=Character.toLowerCase(ch);
            }
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}