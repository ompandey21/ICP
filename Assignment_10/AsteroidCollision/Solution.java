package Assignment_10.AsteroidCollision;

import java.util.Stack;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                st.add(asteroids[i]);
            } else {
                int a = Math.abs(asteroids[i]);
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < a) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == a) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
            }
        }
        // System.out.println(st);
        int res[] = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
}
