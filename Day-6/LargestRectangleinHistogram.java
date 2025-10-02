// LeetCode 84

import java.util.*;
public class LargestRectangleinHistogram {
    class Solution {
        public int largestRectangleArea(int[] arr) {
            int n = arr.length;
            if (n == 1)
                return arr[0];

            int res = 0;

            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                    int num = arr[st.pop()];
                    int pse = st.isEmpty() ? -1 : st.peek();
                    int nse = i;
                    res = Math.max(res, num * (nse - pse - 1));

                }
                st.push(i);

            }
            while (!st.isEmpty()) {
                int nse = n;
                int num = arr[st.pop()];
                int pse = st.isEmpty() ? -1 : st.peek();

                res = Math.max(res, num * (nse - pse - 1));

            }

            return res;

        }
    }
}
