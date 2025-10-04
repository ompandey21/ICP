package Assignment_7.MaximumSubarray;

class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        
        int sum = 0;
        for(int j = 0; j<nums.length; j++){
            sum+=nums[j];
            ans = Math.max(sum, ans);
            if(sum<0){
                sum =0;
            }
        }
         
         return ans;
    }
}
