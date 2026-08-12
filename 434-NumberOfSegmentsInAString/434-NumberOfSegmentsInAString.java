// Last updated: 8/12/2026, 11:15:46 AM
class Solution {
    public int countSegments(String s) {
        String[]w=s.trim().split("\\s+");
        if(s.trim().isEmpty()){
            return 0;
        }
        return w.length;
    }
}