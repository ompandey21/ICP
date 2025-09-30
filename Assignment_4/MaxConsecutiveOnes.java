package Assignment_4;

public class MaxConsecutiveOnes {
    class Solution {
        public int longestOnes(int[] nums, int k) {
            int n = nums.length;

            int left = 0;
            int right = 0;
            int max = 0;
            while (right < n) {
                if (nums[right] != 1) {
                    if (k == 0) {
                        while (left <= right && k <= 0) {
                            if (nums[left++] != 1)
                                k++;
                        }
                    }
                    k--;
                }

                max = Math.max(max, right - left + 1);
                System.out.println(left + " " + right + " " + max);
                right++;
            }
            return max;
        }
    }
}
