class Solution {
    public int climbStairs(int n) {
        
        if (n <= 1) {return 1;}
        
        int oneStepBefore = 1;
        int twoStepsBefore = 1;
        int numOfPossibilities = 2;
        
        
        while (n-- > 1) {
            numOfPossibilities = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = numOfPossibilities;
        }
        
        return numOfPossibilities;
    }
}
