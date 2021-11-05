class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {return false;} 
        if (x < 10) {return true;}
        if (x % 10 == 0) {return false;}
        
        int reversed = 0;
        
         while( x > reversed ) {
             int mod = x % 10;
             
             
             x /= 10;
             
             reversed = (reversed * 10) + mod;
        }
       
        

        System.out.println(reversed);
        if(reversed == x || x == reversed / 10) {
            return true;
        }
        return false;
        
    }
}
