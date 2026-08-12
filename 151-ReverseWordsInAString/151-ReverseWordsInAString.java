// Last updated: 8/12/2026, 11:18:06 AM
class Solution {
    public String reverseWords(String s) {
       s=s.trim();
       String []w=s.split("\\s+");
       String res="";
       for(int i=w.length-1;i>=0;i--){
        res+=w[i];
         if(i!=0){
        res=res+" ";
       }
       }
       return res;
    }
}