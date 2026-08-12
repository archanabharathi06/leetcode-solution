// Last updated: 8/12/2026, 11:12:55 AM
class Solution {
    public int maxNumberOfBalloons(String text) {
       String s="balloon";
       int ans=Integer.MAX_VALUE;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int count=0;
        int ballooncount=0;
        for(int j=0;j<text.length();j++){
            if(text.charAt(j)==ch){
                count++;
            }
        }
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==ch){
                ballooncount++;
            }
        }
        ans=Math.min(ans,count/ ballooncount);
       } 
       return ans;
    }
}