
public class MinimumTimeforTrips {
    class Solution {
        public long minimumTime(int[] time, int totalTrips) {
            int n = time.length;
            int min = time[0];
            for (int i = 1; i < n; i++) {
                min = Math.min(min, time[i]);
            }

            long low = 1;
            long high = 1L * min * totalTrips;
            long ans = high;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (isPossible(mid, time, totalTrips)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return ans;
        }

        private boolean isPossible(long k, int[] arr, int trips) {
            long res = 0;
            for (int a : arr) {
                res += k / a;
                if (res >= trips)
                    return true;
            }
            return res >= trips;
        }
    }

}
