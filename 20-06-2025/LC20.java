class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack <Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{'||ch=='('){
                st.push(ch);
            }
            else
            {
                if(st.isEmpty()) 
                    return false;
                else if (ch==']'){
                    if (st.peek()=='[')
                        st.pop();
                    else return false;
                }
                if (ch=='}'){
                    if (st.peek()=='{')
                        st.pop();
                    else return false;
                }
                if (ch==')'){
                    if (st.peek()=='(')
                        st.pop();
                    else return false;
                }
            }
        } 
        if(st.size()==0) return true;
        else return false;
    }
}
