import java.util.HashMap;

public class RabbitsInForest {
    class Solution {
        public int numRabbits(int[] answers) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int count = 0;

            for (int a : answers) {
                map.put(a, map.getOrDefault(a, 0) + 1);
                if (map.get(a) == a + 1) {
                    map.put(a, 0);
                    count += a + 1;
                }
            }
            for (int a : map.keySet()) {
                int cur = map.get(a);
                if (cur > 0)
                    count += a + 1;
            }
            return count;
        }
    }
}
