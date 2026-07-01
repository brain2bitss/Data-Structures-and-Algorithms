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
    public int fun(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftheight = fun(root.left);
        int rightheight = fun(root.right);
        int diff = Math.abs(leftheight - rightheight);
        
        if(diff > 1 || leftheight == -1 || rightheight == -1){
            return -1;
        }
        return Math.max(leftheight, rightheight) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        return fun(root) != -1;
    }
}