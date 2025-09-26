public class Max_sum_circular {
    class Solution {
        public int maxSubarraySumCircular(int[] nums) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            int totalSum = 0;
            boolean allneg = true;
            int maxElement = Integer.MIN_VALUE;
            for (int a : nums) {
                if (a >= 0)
                    allneg = false;
                sum += a;
                totalSum += a;
                max = Math.max(max, sum);
                if (sum < 0)
                    sum = 0;
                maxElement = Math.max(maxElement, a);
            }
            if (allneg)
                return maxElement;
            int min = Integer.MAX_VALUE;
            sum = 0;
            for (int a : nums) {
                sum += a;
                min = Math.min(min, sum);
                if (sum > 0)
                    sum = 0;
            }

            return Math.max(max, totalSum - min);
        }
    }
}
