public class Koko_eating_bananas {
    class Solution {
        public int minEatingSpeed(int[] arr, int h) {
            int low = 1;
            int max = arr[0];
            for (int a : arr) {
                max = Math.max(a, max);
            }
            int high = max;
            int ans = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (isPossible(mid, arr, h)) {
                    ans = mid;
                    high = mid - 1;
                } else
                    low = mid + 1;
            }
            return ans;
        }

        public static boolean isPossible(int k, int[] arr, int h) {
         
            int res = 0;
            for (int i = 0; i < arr.length; i++) {
                if (res > h)
                    return false;
                res += arr[i] / k;
                if (arr[i] % k != 0)
                    res++;
            }
            return res <= h;
        }
    }
}
