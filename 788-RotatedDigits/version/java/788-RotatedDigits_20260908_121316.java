// Last updated: 9/8/2026, 12:13:16 PM
1class Solution {
2    public int rotatedDigits(int n) {
3        int ans=0;
4        for(int i=1;i<=n;i++){
5            int num=i;
6            boolean valid=true;
7            boolean dif=false;
8            while(num>0){
9                int dig=num%10;
10                if(dig==3||dig==4||dig==7){
11                    valid=false;
12                    break;
13                }
14                if(dig==2||dig==5||dig==6||dig==9){
15                    dif=true;
16                }
17                num/=10;
18            }
19            if(valid && dif){
20                ans++;
21            }
22        }
23        return ans;
24    }
25}