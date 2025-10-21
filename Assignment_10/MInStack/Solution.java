package Assignment_10.MInStack;

import java.util.*;

class MinStack {
    private class Pair{
        int val, min;
        Pair(int v, int m){
            this.val = v;
            this.min = m;
        }
    }

    private Stack<Pair> st;
    private int min;

    public MinStack() {
        st = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        st.push(new Pair(val, min));
    }
    
    public void pop() {
        st.pop();
        min =  st.isEmpty() ? Integer.MAX_VALUE : st.peek().min;
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */