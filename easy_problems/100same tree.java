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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null ||  q==null){
        return p==q;
    }
    return (p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
}
// for the corner cases we wil check that the if p and q voth the tree node is null thenwe will retunr the p==q and after that we return after checking the the equality of root node along with the left and right node 
