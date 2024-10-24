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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // Base case: if both roots are null, they are equivalent
        if (root1 == null && root2 == null) {
            return true;
        }
        
        // If one of the roots is null, but not the other, they are not equivalent
        if (root1 == null || root2 == null) {
            return false;
        }
        
        // If the values of the current nodes are different, they are not equivalent
        if (root1.val != root2.val) {
            return false;
        }
        
        // Check if the trees are equivalent without any flips
        // OR check if they are equivalent with a flip (swapping left and right subtrees)
        boolean noFlip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        
        return noFlip || flip;
    }
}
