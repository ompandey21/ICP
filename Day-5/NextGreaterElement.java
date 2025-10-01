import java.util.HashMap;

public class NextGreaterElement {
    class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[m];

        for (int i = 0; i < n; i++)
            map.put(nums2[i], i);

        int[] prefix = new int[n];
        prefix[n - 1] = nums2[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            prefix[i] = Math.max(prefix[i + 1], nums2[i]);

        }

        for (int i = 0; i<m; i++) {
            int idx = map.get(nums1[i]);

            if (prefix[idx] == nums2[idx])
                res[i] = -1;
            else {
                for (int j = idx; j < n; j++) {
                    if (nums2[j] > nums1[i]) {
                        res[i] = nums2[j];
                        break;
                    }
                }
            }
        }
        return res;

    }

}
}
