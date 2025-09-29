import java.util.PriorityQueue;
// LeetCode 378
public class KthSmallestElementInMatrix {
    class Solution {
        class Pair {
            int val;
            int row;
            int col;

            Pair(int val, int row, int col) {
                this.val = val;
                this.row = row;
                this.col = col;
            }
        }

        public int kthSmallest(int[][] matrix, int k) {
            int n = matrix.length;
            PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> {
                return Integer.compare(a.val, b.val);
            });
            int idx = 0;
            for (int[] arr : matrix) {
                heap.add(new Pair(arr[0], idx++, 0));
            }

            while (k-- > 1) {
                Pair cur = heap.poll();
                if (cur.col < n - 1)
                    heap.add(new Pair(matrix[cur.row][cur.col + 1], cur.row, cur.col + 1));
            }
            return heap.poll().val;
        }
    }
}
