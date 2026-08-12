// Last updated: 8/12/2026, 11:15:31 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                String sub=s.substring(0,i);
                boolean match=true;
                for(int j=i;j<n;j+=i){
                    if(!s.substring(j,j+i).equals(sub)){
                        match=false;
                        break;
                    }
                }
                if(match){
                    return true;
                }
            }
        }
        return false;
    }
}