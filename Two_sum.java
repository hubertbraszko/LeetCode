
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        
        indices[0] = -1;
        indices[1] = -1;   
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        
        for (int i = 0; i < nums.length; i++){
            Integer compliment = target - nums[i];
            if(map.containsKey(compliment) && map.get(compliment) != i){
                indices[0] = i;
                indices[1] = map.get(compliment);
                return indices;
            }
        }
        
        return indices;
        
    }
}