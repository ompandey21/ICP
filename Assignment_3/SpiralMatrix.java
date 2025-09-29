// LeetCode 54
package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            int m = matrix.length;
            int n = matrix[0].length;
            int top = 0;
            int bottom = m - 1;
            int left = 0;
            int right = n - 1;
            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++) {
                    res.add(matrix[top][i]);

                }
                top++;

                for (int i = top; i <= bottom; i++) {
                    res.add(matrix[i][right]);

                }
                right--;

                // Traverse from right to left (check if still within bounds)
                if (top <= bottom) {
                    for (int j = right; j >= left; j--) {
                        res.add(matrix[bottom][j]);
                    }
                    bottom--;
                }

                // Traverse from bottom to top (check if still within bounds)
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        res.add(matrix[i][left]);
                    }
                    left++;
                }

            }
            return res;
        }
    }
}
