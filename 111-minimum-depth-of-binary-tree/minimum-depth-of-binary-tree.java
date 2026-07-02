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
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        while(!q.isEmpty()){
            int levelsize = q.size();
            for(int i = 0; i < levelsize; i++){
                TreeNode node = q.poll();
                if(node.right == null && node.left == null){
                    return level;
                }
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            level++;
        }
        return level;
    }
}

// class Solution {
//     public int minDepth(TreeNode root) {
//         if(root == null){
//             return 0;
//         }
//         if(root.left == null){
//             return 1 + minDepth(root.right);
//         }
//         if(root.right == null){
//             return 1 + minDepth(root.left);
//         }
//         return 1 + Math.min(minDepth(root.left), minDepth(root.right));
//     }
// }