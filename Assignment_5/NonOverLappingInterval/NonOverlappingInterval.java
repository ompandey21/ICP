package Assignment_5;

// LeetCode 435

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingInterval {
    class Solution {
        public int eraseOverlapIntervals(int[][] arr) {
            if (arr.length <= 1)
                return 0;

            Arrays.sort(arr, Comparator.comparingInt(row -> row[0]));
            
            int prevEnd = arr[0][1];
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                int start = arr[i][0];
                int end = arr[i][1];
                if (prevEnd > start) {
                    count++;
                    prevEnd = Math.min(prevEnd, end);
                } else {
                    prevEnd = end;
                }

            }
            return count;
        }
    }
}
