class Solution {
    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
         inOrder(root);
        return ans;
    }
    
    public void inOrder(TreeNode root){
        if(root.left!=null) inOrder(root.left);
        ans = Math.min(ans,Math.abs(root.val-prev));
        prev = root.val;
        if(root.right!=null) inOrder(root.right);
    }
}
/*Initiate 2 Global variables:
int prev = Integer.MAX_VALUE;
int ans = Integer.MAX_VALUE;
call inorderTraversal on root
Within Inorder function :
if left!= null inorder(left)
Compute the ans here i.e ans = Math.min(ans, root.val-prev)
if right!= null inorder(right)
return ans */
