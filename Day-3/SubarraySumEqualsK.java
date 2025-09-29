// LeetCode 560

import java.util.HashMap;

public class SubarraySumEqualsK {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int n = nums.length;
            for (int i = 1; i < n; i++) {
                nums[i] += nums[i - 1];
            }

            int count = 0;

            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);
            for (int a : nums) {
                if (map.containsKey(a - k)) {
                    count += map.get(a - k);
                }
                map.put(a, map.getOrDefault(a, 0) + 1);
            }
            return count;
        }
    }
}
