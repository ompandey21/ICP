import java.util.*;
public class FilterRestaurants {
    class Solution {
        class Pair {
            int id;
            int rating;

            Pair(int id, int rt) {
                this.id = id;
                this.rating = rt;
            }
        }

        public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
            List<Pair> li = new ArrayList<>();
            for (int[] arr : restaurants) {
                if (isValid(arr, maxPrice, maxDistance, veganFriendly)) {
                    li.add(new Pair(arr[0], arr[1]));
                }
            }
            Collections.sort(li, (a, b) -> {
                if (a.rating == b.rating)
                    return Integer.compare(b.id, a.id);
                else
                    return Integer.compare(b.rating, a.rating);
            });

            List<Integer> ans = new ArrayList<>();
            for (Pair p : li) {
                ans.add(p.id);
            }
            return ans;
        }

        public static boolean isValid(int[] arr, int mp, int md, int isVeg) {
            if (isVeg == 1 && arr[2] != 1)
                return false;
            if (arr[3] <= mp && arr[4] <= md)
                return true;
            else
                return false;
        }
    }
}
