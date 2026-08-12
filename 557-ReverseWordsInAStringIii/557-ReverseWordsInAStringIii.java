// Last updated: 8/12/2026, 11:15:05 AM
class Solution {
    public String reverseWords(String s) {
        String w[]=s.split(" ");
        String res="";
        for(int i=0;i<w.length;i++){
            String rev="";
            for(int j=w[i].length()-1;j>=0;j--){
                rev+=w[i].charAt(j);
            }
           res+=rev;
           if(i!=w.length-1){
            res+=" ";
        }
        }
        return res;
    }
}