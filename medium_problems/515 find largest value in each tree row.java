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

 /** approach
 Initialization: Begin with initializing a queue and adding the root node to it. This queue will help in level order traversal.
Level-wise Traversal: As long as the queue is not empty, we keep on processing nodes. For each level, we will calculate its size (i.e., the number of nodes in the current level). This helps in segregating nodes of different levels.
Capture Maximum: For each level, initialize a variable max_val with the smallest possible integer. As we process each node in the current level, we update max_val to be the maximum between the node's value and the current max_val.
Child Processing: After processing a node, we add its left and right children (if they exist) to the queue for the next level's processing.
Result Update: Once all nodes of a level are processed, the maximum value for that level (max_val) is added to the result list.
  */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int curr_level_size = queue.size();
            int max_val = Integer.MIN_VALUE;
            
            for (int i = 0; i < curr_level_size; i++) {
                TreeNode node = queue.poll();
                max_val = Math.max(max_val, node.val);
                
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            
            result.add(max_val);
        }
        
        return result;
    }
}
