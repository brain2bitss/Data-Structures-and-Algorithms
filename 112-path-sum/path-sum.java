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
    private boolean value = false;
    public void dfs(TreeNode root, int targetSum, int sum){
        if(root == null){
            return;
        }
        sum = sum + root.val;
        if(root.left == null && root.right == null && sum == targetSum){
            value = true;
            return;
        }
        dfs(root.left, targetSum, sum);
        dfs(root.right, targetSum,sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum , 0);
        return value;
    }
}