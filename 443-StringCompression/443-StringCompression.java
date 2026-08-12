// Last updated: 8/12/2026, 11:15:43 AM
class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if(n==1) return 1;
        int i=0;
        int indx=0;
        while(i<n){
            char curr_char=chars[i];
            int c=0;
            while(i<n && chars[i]==curr_char){
                c+=1;
                i+=1;
            }
            chars[indx]=curr_char;
            indx+=1;
            if(c>1){
                String str=Integer.toString(c);
                for(char ch:str.toCharArray()){
                    chars[indx++]=ch;
                }
            }
        }
        return indx;
    }
}