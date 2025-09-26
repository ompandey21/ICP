public class First_and_Last {
    public class Find_First_and_Last_Index {
    class Solution {
        public static int findLeft(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int idx = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    idx = mid;
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else
                    right = mid - 1;
            }
            return idx;
        }

        public static int findRight(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int idx = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    idx = mid;
                    left = mid + 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else
                    right = mid - 1;
            }
            return idx;

        }

        public int[] searchRange(int[] nums, int target) {
            int[] res = new int[2];
            res[0] = findLeft(nums, target);
            res[1] = findRight(nums, target);

            return res;
        }
    }
}

}
