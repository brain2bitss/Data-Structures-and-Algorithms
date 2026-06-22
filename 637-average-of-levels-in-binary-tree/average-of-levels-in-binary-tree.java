class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;
        
        Queue<TreeNode> queue = new ArrayDeque<>(); // Most efficient Queue
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            long sum = 0; // Use long to prevent overflow
            
            // Process entire level
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                
                // Only add non-null children
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            
            result.add((double) sum / levelSize);
        }
        
        return result;
    }
}