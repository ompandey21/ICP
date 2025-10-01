package Assignment_5.QueueHeightMatching;
import java.util.*;
class Solution {
    public int[][] reconstructQueue(int[][] people) {
      
        Arrays.sort(people, (a, b) -> {
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            else return Integer.compare( b[0], a[0]);
        });
        
        List<int[]> list = new ArrayList<>();
        for (int[] p : people) {
            list.add(p[1], p);  
        }

        return list.toArray(new int[people.length][2]);
    }
}
