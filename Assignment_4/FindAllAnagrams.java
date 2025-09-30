package Assignment_4;

// LeetCode 438

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int n = s.length();
            int m = p.length();

            List<Integer> li = new ArrayList<>();

            int[] mask = getHash(p, 0, m);

            int left = 0;
            int right = m;

            while (right <= n) {
                int[] cur = getHash(s, left, right);
                boolean found = true;
                for (int i = 0; i < 26; i++) {
                    if (mask[i] != cur[i])
                        found = false;
                }
                if (found)
                    li.add(left);
                left++;
                right++;
            }
            return li;

        }

        public static int[] getHash(String s, int si, int ei) {
            int[] hash = new int[26];

            for (int i = si; i < ei; i++) {
                hash[s.charAt(i) - 'a']++;

            }

            return hash;
        }
    }
}
