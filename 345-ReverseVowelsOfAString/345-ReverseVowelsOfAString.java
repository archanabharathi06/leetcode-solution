// Last updated: 8/12/2026, 11:16:26 AM
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (!isVowel(arr[left])) {
                left++;
                continue;
            }
            if (!isVowel(arr[right])) {
                right--;
                continue;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        return new String(arr);
    }
    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' 
            || c == 'o' || c == 'u';
    }
}