package Assignment_4;

import java.util.HashSet;

// LeetCode 3
public class LongestSubstringWithoutRepetition {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s.length() <= 1)
                return s.length();
            int max = 0;
            int left = 0;
            int right = 0;
            HashSet<Character> set = new HashSet<>();
            while (right < s.length()) {
                char currentChar = s.charAt(right);
                while (set.contains(currentChar)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(currentChar);
                max = Math.max(max, right - left + 1);
                right++;
            }
            return max;
        }

    }
}
