class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length ;
        int mid = left + (right-left)/2;
        
        while(left<right) {
            
            mid = left + (right-left)/2;
        
            if(nums[mid] < target) {
                
                left = mid + 1; // if nums[mid] is less than target, target cant be at current middle 
            } else  {
                right = mid;
            } 
        }
        
        return left;
        
        
    }
}