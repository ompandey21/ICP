// Leetcode 38
public class CountandSay {
    class Solution {
        public String countAndSay(int n) {
            String[] dp = new String[n];
            return CAS(n, dp);
        }

        public String CAS(int n, String[] dp) {
            if (n == 1)
                return "1";
            if (dp[n - 1] != null)
                return dp[n - 1];

            return dp[n - 1] = RLE(CAS(n - 1, dp));
        }

        public String RLE(String s) {
            StringBuilder res = new StringBuilder();
            char c = s.charAt(0);
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != c) {

                    res.append(Integer.toString(count));
                    res.append(c);
                    count = 0;

                }
                count++;
                c = s.charAt(i);

            }
            if (count > 0) {
                res.append(Integer.toString(count));
                res.append(c);
            }
            return res.toString();
        }
    }
}
