//my original solution, O(n) time and O(n) memory
class Solution {
    public void moveZeroes(int[] nums) {
        
        int N = nums.length;
        int[] moved = new int[N];
        
        int index = 0;
        
        for (int i = 0; i<N; i++){
            if(nums[i] != 0)  moved[index++] = nums[i];
        }
        
        for (int i = 0; i < N; i++) {
            nums[i] = moved[i];
        }
        
    }
}

//Better solution, in place algo
class Solution {
    public void moveZeroes(int[] nums) {
        
        int N = nums.length;
        int index = 0;
        
        for (int i = 0; i<N; i++){
            if(nums[i] != 0)  nums[index++] = nums[i];
        }
        
        while (index < N) {
            nums[index++] = 0;
        }
    }
}
