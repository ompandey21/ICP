package Assignment_10.DecodeString;

import java.util.*;
class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String substr = "";
            if (s.charAt(i) == ']') {
                while (!st.isEmpty() && st.peek() != '[') {
                    substr += st.peek();
                    st.pop();
                }
                st.pop();
                int times = 0;
                int mul = 1;
                while (!st.isEmpty() && (st.peek() >= '0' && st.peek() <= '9')) {
                    times += (st.peek() - '0') * mul;
                    mul *= 10;
                    st.pop();
                }
                while (times > 0) {
                    for (int j = substr.length() - 1; j >= 0; j--)
                        st.push(substr.charAt(j));
                    times--;
                }
            } else
                st.push(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.peek());
            st.pop();
        }
        ans.reverse();
        return ans.toString();
    }
}