// Last updated: 8/12/2026, 11:11:33 AM
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int left=0;
            int right=s.length()-1;
            int flag=1;
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    flag=0;
                    break;
                }
                left++;
                right--;
            }
            if(flag==1){
                return s;
            }
        }
        return "";
    }
}