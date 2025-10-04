package Assignment_7.UniquePaths;

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return findPaths(dp, 0, 0);
    }
    public static int findPaths( int[][] dp, int row, int col){

        int n = dp.length;
        int m = dp[0].length;
        if(row >= n || col >= m) return 0;
        if(dp[row][col] != 0) return dp[row][col];
        if(row == n-1 && col == m-1) return 1;

        int right = findPaths(dp, row , col + 1);
        int down = findPaths(dp, row + 1 , col );

        return dp[row][col] = right + down;
    }
}