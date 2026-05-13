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
    public int fun(TreeNode node, int maxval){
        if(node == null){
            return 0;
        }
        int count = 0;
        if(node.val >= maxval){
            maxval = node.val;
            count = 1;
        }
        count += fun(node.left, maxval);
        count += fun(node.right, maxval);
        return count;
    }
    public int goodNodes(TreeNode root) {
        return fun(root, root.val);
    }
}