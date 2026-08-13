// Last updated: 8/13/2026, 12:00:31 PM
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line=1;
        int pixel=0;
        for(int i=0;i<s.length();i++){
            int w=widths[s.charAt(i)-'a'];
            if(pixel+w>100){
                line++;
                pixel=w;
            }
            else{
                pixel+=w;
            }
        }
        return new int[]{line,pixel};
    }
}