/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList();
        addVal(root, lst);
        return lst;
 
    }
    
    public void addVal(TreeNode root, List<Integer> lst) {
        
                
        if (root != null) {
            
            if(root.left != null) {
                addVal(root.left, lst);
            }
            
            lst.add(root.val);
            
            if(root.right != null) {
                addVal(root.right, lst);
            }
        }
        
    }
}
