// Last updated: 8/12/2026, 11:13:53 AM
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       int sumA=0,sumB=0;
       for(int i=0;i<aliceSizes.length;i++){
        sumA+=aliceSizes[i];
       } 
       for(int i=0;i<bobSizes.length;i++){
        sumB+=bobSizes[i];
       }
       int diff=(sumB-sumA)/2;
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<bobSizes.length;i++){
        set.add(bobSizes[i]);
       }
       for(int i=0;i<aliceSizes.length;i++){
        int x = aliceSizes[i];
        int y = x + diff;
        if(set.contains(y)){
            return new int[]{x, y};
        }
       }
       return new int[]{};
    }
}