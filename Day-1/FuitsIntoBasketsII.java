public class FuitsIntoBasketsII {
    class Solution {
        public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
            int count = 0;
            for (int i = 0; i < fruits.length; i++) {
                boolean flag = false;
                for (int j = 0; j < baskets.length; j++) {
                    if (fruits[i] <= baskets[j]) {
                        baskets[j] = -1;
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    count++;
                }
            }
            // System.gc();
            return count++;
        }
    }
}
