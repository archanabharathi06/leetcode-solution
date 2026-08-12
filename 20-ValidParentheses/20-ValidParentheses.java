// Last updated: 8/12/2026, 11:20:16 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                st.push(c);
            }
            else if(c==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(c==']'){
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(c=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}