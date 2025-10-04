package Assignment_7.HouseRobber;
import java.util.*;
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return maxRob(true, 0, nums.length -1 , nums , dp);
    }
    public static int maxRob(boolean fromZero , int start, int end, int[] arr, int[] dp){
         
        if(start > end) return 0;
        if(dp[start] != -1) return dp[start];
        if(start == end) return dp[start] = arr[start];
        int rob = arr[start] + maxRob(fromZero, start + 2, end, arr, dp);
        int notRob = maxRob(fromZero, start + 1, end, arr, dp);
        return  dp[start] = Math.max(rob, notRob);

    }
}
