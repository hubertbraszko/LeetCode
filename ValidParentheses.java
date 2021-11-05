import java.util.*;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack();
        
        Map<Character,Character> pairs = new HashMap<>();
        
        pairs.put('(',')');
        pairs.put('[',']');
        pairs.put('{','}');
        
        
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(pairs.containsKey(current)) {
                stack.push(pairs.get(current));
            } else if (pairs.containsValue(current)) {
                
              if(!stack.empty() && stack.peek() == current) {
                  stack.pop();
              } else {
                  return false;
              }
                
            } 
        }
        if(!stack.empty()) {return false;}
        
        return true;
     
    }
}
