// LeetCode 1094

public class CarPooling {
    class Solution {
        public boolean carPooling(int[][] trips, int capacity) {
            int maxEnd = 0;
            // Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));
            for (int[] arr : trips) {
                maxEnd = Math.max(maxEnd, arr[2]);
            }
            int[] res = new int[maxEnd + 1];
            for (int[] arr : trips) {
                int num = arr[0];
                int start = arr[1];
                int end = arr[2];

                res[start] += num;
                if (end < maxEnd)
                    res[end] -= num;

            }
            int max = getMax(res);
            // System.out.println(Arrays.toString(res));
            if (max > capacity)
                return false;
            return true;
        }

        public static int getMax(int[] arr) {
            int prev = 0;
            int max = 0;
            for (int a : arr) {
                prev += a;
                max = Math.max(prev, max);
            }
            return max;

        }
    }
}
