// Last updated: 8/12/2026, 11:11:40 AM
class Solution {
    public int countWords(String[] words1, String[] words2) {
        int c=0;
        for(int i=0;i<words1.length;i++){
           int c1=0;
           int c2=0;
           for(int j=0;j<words1.length;j++){
            if(words1[i].equals(words1[j])){
                c1++;
            }
           }
           for(int k=0;k<words2.length;k++){
            if(words1[i].equals(words2[k])){
                c2++;
            }
           }
           if(c1==1&&c2==1){
            c++;
           }
        }
        return c;
    }
}