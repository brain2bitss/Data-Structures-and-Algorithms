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
// class Solution {
//     public boolean hasPathSum(TreeNode root, int targetSum) {
//         if (root == null) {
//             return false;
//         }
//         Stack<TreeNode> stack = new Stack<>();
//         Stack<Integer> sum = new Stack<>();
//         int currentsum = targetSum - root.val;
//         stack.push(root);
//         sum.push(currentsum);
//         while (!stack.isEmpty()) {
//             int levelsize = stack.size();
//             for (int i = 0; i < levelsize; i++) {
//                 TreeNode node = stack.pop();
//                 currentsum = sum.pop();
//                 if (node.left == null && node.right == null && currentsum == 0) {
//                     return true;
//                 }
//                 if (node.left != null) {
//                     stack.push(node.left);
//                     sum.push(currentsum - node.left.val);
//                 }
//                 if (node.right != null) {
//                     stack.push(node.right);
//                     sum.push(currentsum - node.right.val);
//                 }
//             }
//         }
//         return false;
//     }
// }

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