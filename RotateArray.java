class Solution {
    public void rotate(int[] nums, int k) {
        int right = 0;
        int left = 0;
        
        k = k % nums.length;
        
        right = nums.length - k;
       // left = right - 1;
        
        int[] rotated = new int[nums.length];
        
        int index = 0;
        
        
        while(right < nums.length) {
            
            rotated[index++] = nums[right++];
        }
        
        while(index < nums.length) {
            
            
            rotated[index++] = nums[left++];
        }
        
        for (int i = 0; i < nums.length; i++) {
             nums[i] = rotated[i];
        }
        
    }
}
