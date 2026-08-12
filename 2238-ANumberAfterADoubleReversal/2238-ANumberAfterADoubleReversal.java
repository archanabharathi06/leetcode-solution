// Last updated: 8/12/2026, 11:11:30 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
    int temp=num;
    int rev=0;
    while(num!=0){
        int d=num%10;
        rev=rev*10+d;
        num=num/10;
    }
    int rev1=0;
    while(rev!=0){
        int di=rev%10;
        rev1=rev1*10+di;
        rev=rev/10;
    }
    if(temp==rev1)
    return true;
    else
    return false;
        
    }
}