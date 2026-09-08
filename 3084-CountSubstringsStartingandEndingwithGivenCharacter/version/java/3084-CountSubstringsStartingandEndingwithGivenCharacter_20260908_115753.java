// Last updated: 9/8/2026, 11:57:53 AM
1class Solution {
2    public long countSubstrings(String s, char c) {
3        long count=0;
4        long ans=0;
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)==c){
7                count++;
8                ans+=count;
9            }
10        }
11        return ans;
12    }
13}