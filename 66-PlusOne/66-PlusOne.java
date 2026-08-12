// Last updated: 8/12/2026, 11:19:21 AM
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+ 1 <10)
            {
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}