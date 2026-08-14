// Last updated: 8/14/2026, 11:39:42 AM
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed, int n) {
3        for(int i=0;i<flowerbed.length;i++){
4            if(flowerbed[i]==0){
5                if(i==0 || flowerbed[i-1]==0){
6                    if(i==flowerbed.length-1 || flowerbed[i+1]==0){
7                        flowerbed[i]=1;
8                        n--;
9                    }
10                }
11            }
12        }
13        return n<=0;
14    }
15}