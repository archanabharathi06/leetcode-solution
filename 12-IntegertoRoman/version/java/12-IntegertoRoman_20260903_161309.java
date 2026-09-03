// Last updated: 9/3/2026, 4:13:09 PM
1class Solution {
2    public String intToRoman(int num) {
3       int []values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
4       String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
5       String ans="";
6       for(int i=0;i<values.length;i++){
7        while(num>=values[i]){
8            ans+=roman[i];
9            num-=values[i];
10        }
11       }
12       return ans;
13    }
14}