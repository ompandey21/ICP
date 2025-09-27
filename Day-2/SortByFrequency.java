import java.util.*;

public class SortByFrequency {
    class Solution {
        class Pair {
            char ch;
            int freq;

            Pair(char c, int f) {
                this.ch = c;
                this.freq = f;
            }
        }

        public String frequencySort(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }

            PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> {
                return Integer.compare(b.freq, a.freq);
            });

            for (char c : map.keySet()) {
                heap.add(new Pair(c, map.get(c)));
            }

            StringBuilder sb = new StringBuilder();
            while (!heap.isEmpty()) {
                Pair cur = heap.poll();
                while (cur.freq-- > 0) {
                    sb.append(cur.ch);
                }
            }
            return sb.toString();
        }
    }
}