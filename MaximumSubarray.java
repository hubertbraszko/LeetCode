class Solution {
    public int maxSubArray(int[] nums) {
        //Kadane's algorithm
        int current_sum = nums[0];
        int max_sum = nums[0];
        
        for(int i = 1; i < nums.length;i++) {
            current_sum = Math.max(current_sum + nums[i], nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        
        return max_sum;
    }
}
