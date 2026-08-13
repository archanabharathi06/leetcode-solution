// Last updated: 8/13/2026, 11:35:33 AM
1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        int line=1;
4        int pixel=0;
5        for(int i=0;i<s.length();i++){
6            int w=widths[s.charAt(i)-'a'];
7            if(pixel+w>100){
8                line++;
9                pixel=w;
10            }
11            else{
12                pixel+=w;
13            }
14        }
15        return new int[]{line,pixel};
16    }
17}