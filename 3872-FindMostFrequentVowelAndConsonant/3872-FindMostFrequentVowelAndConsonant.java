// Last updated: 8/12/2026, 11:09:29 AM
class Solution {
    public int maxFreqSum(String s) {
        int frq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            frq[ch-'a']++;
        }
        int maxVow=0;
        int maxCon=0;
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                if(frq[i]>maxVow){
                    maxVow=frq[i];
                }
            }
            else{
                if(frq[i]>maxCon){
                    maxCon=frq[i];
                }
            }
        }
        return maxVow + maxCon;
    }
}