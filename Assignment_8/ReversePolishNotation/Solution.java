import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String ops = "+-*/";
        for(String s: tokens){
            if(!ops.contains(s)) st.push(Integer.parseInt(s));
            else{
                int a = st.pop();
                int b = st.pop();
                if(s.equals("+")) st.push(a + b);
                if(s.equals("-")) st.push(b - a);
                if(s.equals("*")) st.push(a * b);
                if(s.equals("/")) st.push(b / a);
            }
        }

        
       

      
   
        return st.pop();

    }
}