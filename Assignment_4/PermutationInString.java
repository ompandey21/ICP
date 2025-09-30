package Assignment_4;

// LeetCode 567

public class PermutationInString {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            int n = s2.length();

            int[] mask = getHash(s1, 0, s1.length());
            int left = 0;
            int right = s1.length();

            while (right < n + s1.length()) {
                int[] cur = getHash(s2, left++, right++);
                boolean found = true;
                for (int i = 0; i < 26; i++) {
                    if (mask[i] != cur[i])
                        found = false;
                }
                if (found)
                    return true;
            }
            return false;
        }

        public static int[] getHash(String s, int si, int ei) {
            int[] hash = new int[26];
            if (ei > s.length()) {
                ei %= s.length();
                for (int i = 0; i < ei; i++) {
                    hash[s.charAt(i) - 'a']++;

                }
                for (int i = si; i < s.length(); i++) {
                    hash[s.charAt(i) - 'a']++;

                }
            } else {
                for (int i = si; i < ei; i++) {
                    hash[s.charAt(i) - 'a']++;

                }
            }
            return hash;
        }
    }
}
