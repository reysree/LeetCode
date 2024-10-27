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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> alist = new ArrayList<>();
        recursion(root, alist);
        return alist;

    }

    public static void recursion(TreeNode root, ArrayList<Integer> alist){

        if(root == null){
            return;
        }
        alist.add(root.val);
        recursion(root.left, alist);
        recursion(root.right, alist);
    }
}