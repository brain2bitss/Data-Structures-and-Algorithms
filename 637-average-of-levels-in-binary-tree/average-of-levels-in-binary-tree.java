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
    public void function(TreeNode root, int level, ArrayList<Integer> count, ArrayList<Long> ans){
        if(root == null){
            return;
        }
        if(ans.size() == level){
            count.add(1);
            ans.add((long)root.val);
        }
        else{
            count.set(level, count.get(level) + 1);
            ans.set(level, ans.get(level) + root.val);
        }
        function(root.left, level + 1, count, ans);
        function(root.right, level + 1, count, ans);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        
        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<Long> ans = new ArrayList<>();
        function(root, 0, count, ans);

        List<Double> result = new ArrayList<>();
        for(int i = 0; i < ans.size(); i++){
            result.add((double)ans.get(i) / count.get(i));
        }
        return result;
    }
}


// class Solution {
//     public List<Double> averageOfLevels(TreeNode root) {
//         List<Double> result = new ArrayList<>();
//         if (root == null) return result;
        
//         Queue<TreeNode> queue = new LinkedList<>(); 
//         queue.offer(root);
        
//         while (!queue.isEmpty()) {
//             int levelSize = queue.size();
//             long sum = 0; 
            
//             for (int i = 0; i < levelSize; i++) {
//                 TreeNode node = queue.poll();
//                 sum += node.val;
//                 if (node.left != null) queue.offer(node.left);
//                 if (node.right != null) queue.offer(node.right);
//             }
            
//             result.add((double) sum / levelSize);
//         }
        
//         return result;
//     }
// }