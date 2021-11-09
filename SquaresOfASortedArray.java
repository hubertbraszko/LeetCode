class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int len = nums.length;
        int pos = 0;
        int neg = 0;
        
         
        while (pos < len && nums[pos] < 0) {
            pos++;
        }
        
        neg = pos - 1;
        
        int[] sorted = new int[len];
        int index = 0;

        
        while (pos < len && neg >= 0) {
            sorted[index++] = nums[pos] < nums[neg]*(-1) ? nums[pos]*nums[pos++] : nums[neg]*nums[neg--];
        }
        
        while (pos < len) {
            sorted[index++] = nums[pos]*nums[pos++];
        }
        
        while (neg >= 0) {
            sorted[index++] = nums[neg]*nums[neg--];
        }
        
        return sorted;
    }
}
