// Last updated: 8/12/2026, 11:14:12 AM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        String res1="";
        String res2="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='#'){
                res1+=ch;
            }else{
                if(res1.length()>0){
                    res1=res1.substring(0,res1.length()-1);
                }
            }
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(ch!='#'){
                res2+=ch;
            }else{
                if(res2.length()>0){
                    res2=res2.substring(0,res2.length()-1);
                }
            }
        }
        return res1.equals(res2);
    }
}