// LeetCode 85

import java.util.*;

public class MaximalRectangle {
    class Solution {
        public int maximalRectangle(char[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            int[][] prefix = new int[n][m];

            for (int i = 0; i < m; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {

                    if (matrix[j][i] == '0')
                        count = 0;
                    else
                        count++;
                    prefix[j][i] = count;
                }

            }
            int res = 0;

            for (int i = 0; i < n; i++) {
                res = Math.max(res, largestArea(prefix[i]));
            }
            return res;

        }

        public int largestArea(int[] arr) {
            int n = arr.length;

            int res = 0;

            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                    int num = arr[st.pop()];
                    int nse = i;
                    int pse = st.isEmpty() ? -1 : st.peek();

                    res = Math.max(res, num * (nse - pse - 1));
                }
                st.push(i);
            }
            while (!st.isEmpty()) {
                int num = arr[st.pop()];
                int nse = n;
                int pse = st.isEmpty() ? -1 : st.peek();

                res = Math.max(res, num * (nse - pse - 1));
            }
            return res;
        }
    }
}
