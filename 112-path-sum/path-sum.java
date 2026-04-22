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
    public boolean fun(TreeNode root, int res, int target){
        if(root == null){
            return false;
        }
        
        res = res + root.val;
        
        if(root.left == null && root.right == null){
            return res == target;
        }
        
        return fun(root.left, res, target) || fun(root.right, res, target);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun(root, 0, targetSum);
    }
}