//brute force
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int N = numbers.length;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if(numbers[i] + numbers[j]  == target && i != j) {
                    return new int[]{i+1,j+1};
                }
        
            }     
        }   
        return new int[2];
    }
}  


//linear solution
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        
        while(true) {  // exactly one solution always exists
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left+1,right+1};
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
    
    }
}
