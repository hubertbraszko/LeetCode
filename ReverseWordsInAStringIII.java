import java.util.Arrays;

class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split("\\s");
        
        
        StringBuffer buffer = new StringBuffer();
        for (int i =0; i < words.length ;i++) {
            buffer.append(" ");
            buffer.append(reverseString(words[i]));
        
        }
        
        buffer.deleteCharAt(0);
        
        return buffer.toString();
        
    }
    
    public String reverseString(String str) {
        
        char[] s = str.toCharArray();
        int N = s.length;
        char left;
        char right;
        
        for (int i = 0; i < N/2 ; i++) {
            left = s[i];
            right = s[N-1-i];            
            s[i] = right;
            s[N-1-i] = left;     
        }
        
        return String.valueOf(s);
    }
}
