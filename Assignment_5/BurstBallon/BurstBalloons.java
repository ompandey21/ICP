package Assignment_5;

// LeetCode 452

import java.util.Arrays;

public class BurstBalloons {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            Arrays.sort(points, (a, b) -> {
                if (a[1] == b[1])
                    return Integer.compare(a[0], b[0]);
                else
                    return Integer.compare(a[1], b[1]);
            });

            int n = points.length;
            int end = points[0][1];
            int arrow = 1;
            for (int i = 1; i < n; i++) {
                int curStart = points[i][0];
                int curEnd = points[i][1];
                if (curStart <= end)
                    continue;

                arrow++;
                end = curEnd;

            }
            return arrow;
        }
    }
}
