class Solution {
    public void reverseString(char[] s) {
        int N = s.length;
        
        char left;
        
        char right;
        
        for (int i = 0; i < N/2 ; i++) {
            left = s[i];
            right = s[N-1-i];            
            s[i] = right;
            s[N-1-i] = left;     
        }
    }
}
