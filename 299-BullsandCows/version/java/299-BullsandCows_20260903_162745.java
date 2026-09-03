// Last updated: 9/3/2026, 4:27:45 PM
1class Solution {
2    public String getHint(String secret, String guess) {
3        int bull=0;
4        int cow=0;
5        int a[]=new int[10];
6        int b[]=new int[10];
7        for(int i=0;i<secret.length();i++){
8            if(secret.charAt(i)==guess.charAt(i)){
9                bull++;
10            }else{
11                a[secret.charAt(i)-'0']++;
12                b[guess.charAt(i)-'0']++; 
13            }
14        }
15        for(int i=0;i<10;i++){
16            cow+=Math.min(a[i],b[i]);
17        }
18        return bull+"A"+cow+"B";
19    }
20}