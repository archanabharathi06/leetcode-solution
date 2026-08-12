// Last updated: 8/12/2026, 11:12:17 AM
class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        for(int i=0;i<n;i++){
           xor^=start+2*i;
        }
        return xor;
    }
}