// LeetCode 1672
public class RichestcostumerWealth {
    class Solution {
    public int maximumWealth(int[][] nums) {
        int sum =0;
        for (int i= 0 ; i< nums.length ;i++){
            int mo =0 ;
            for (int j= 0 ;j < nums[0].length ;j++){
                mo= mo+nums[i][j];
            }
            sum = Math.max(mo,sum);
        }
        return sum;
    }
}
}
