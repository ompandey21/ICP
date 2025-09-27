import java.util.*;

public class GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();

            for (String s : strs) {
                String hashCode = hash(s);
                if (map.get(hashCode) == null) {
                    map.put(hashCode, new ArrayList<>());
                }
                map.get(hashCode).add(s);
            }
            List<List<String>> res = new ArrayList<>();
            for (String arr : map.keySet()) {
                res.add(map.get(arr));

            }
            return res;
        }

        public static String hash(String s) {
            int[] hash = new int[26];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i) - 'a']++;
            }
            return Arrays.toString(hash);
        }
    }
}
