// LeetCode 239

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int right = 0;

            int[] res = new int[n - k + 1];
            Deque<Integer> dq = new ArrayDeque<>();

            int idx = 0;
            while (right < n) {
                while (!dq.isEmpty() && dq.getFirst() <= right - k) {
                    dq.pollFirst();
                }

                while (!dq.isEmpty() && nums[dq.getLast()] <= nums[right]) {
                    dq.pollLast();
                }
                dq.offerLast(right);
                if (right >= k - 1)
                    res[idx++] = nums[dq.getFirst()];

                right++;
            }
            return res;
        }
    }
}
