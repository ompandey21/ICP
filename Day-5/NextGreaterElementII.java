public class NextGreaterElementII {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.max(nums[i], max);
            }
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {

                if (max == nums[i])
                    res[i] = -1;
                else {
                    int j = i + 1;
                    while (j < n * 2 - 1) {
                        if (nums[j % n] > nums[i]) {
                            res[i] = nums[j % n];
                            break;
                        }
                        j++;
                    }
                }
                System.out.println(i + ": [" + res[i] + " ]");
            }
            return res;
        }
    }
}
