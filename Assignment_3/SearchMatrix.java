// LeetCode 74  
package Assignment_3;

public class SearchMatrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int m = matrix[0].length;
            int low = 0;
            int high = m * n - 1;

            while (low <= high) {
                int mid = high - (high - low) / 2;

                int el = matrix[mid / m][mid % m];

                if (el == target)
                    return true;
                else if (el < target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return false;
        }
    }
}
