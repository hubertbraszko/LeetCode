class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        
        for(int i = 0; i< word1.length; i++) {
            buffer1.append(word1[i]);
        }
        
        for(int i = 0; i< word2.length; i++) {
            buffer2.append(word2[i]);
        }
        
        return buffer1.toString().equals(buffer2.toString());
    }
}
