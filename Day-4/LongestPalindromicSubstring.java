// LeetCode 5

public class LongestPalindromicSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            int n = s.length();

            int max = 0;
            String res = "";

            for (int i = 0; i < n; i++) {
                int orbit = 0;
                StringBuilder sb = new StringBuilder();
                while (i - orbit >= 0 && i + orbit < n && s.charAt(i - orbit) == s.charAt(i + orbit)) {
                    if (i - orbit != i + orbit) {
                        sb.insert(0, s.charAt(i - orbit));
                        sb.append(s.charAt(i + orbit));
                    } else
                        sb.append(s.charAt(i + orbit));

                    orbit++;
                }

                if (2 * orbit + 1 > max) {
                    max = 2 * orbit + 1;
                    res = sb.toString();
                }
            }
            for (double i = 0.5; i < n; i++) {
                double orbit = 0.5;
                StringBuilder sb = new StringBuilder();
                while (i - orbit >= 0 && i + orbit < n && s.charAt((int) (i - orbit)) == s.charAt((int) (i + orbit))) {
                    sb.insert(0, s.charAt((int) (i - orbit)));
                    sb.append(s.charAt((int) (i + orbit)));
                    orbit++;
                }

                if (2 * orbit + 1 > max) {
                    max = (int) (2 * orbit + 1);
                    res = sb.toString();
                }
            }
            return res;

        }
    }
}
