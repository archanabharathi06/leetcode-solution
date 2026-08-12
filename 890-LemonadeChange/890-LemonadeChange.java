// Last updated: 8/12/2026, 11:14:04 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int i=0;i<bills.length;i++){
            int b=bills[i];
            if(b==5){
                five++;
            }
            else if(b==10){
                if(five>0){
                    five--;
                    ten++;
                }else{
                    return false;
                }
            }
            else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}