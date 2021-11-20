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
    public int minDepth(TreeNode root) {
        
        if(root == null) return 0;
        
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        int depth = 1;
        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();
                if(currentNode.left == null && currentNode.right == null) return depth;  // i.e if current node has no childers (is a leaf)
                if(currentNode.left != null) queue.offer(currentNode.left);
                if(currentNode.right != null) queue.offer(currentNode.right);
                
            }
            depth++;
        }
    
            
        return depth;
    }
}
