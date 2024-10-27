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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> alist = new ArrayList<>();
        String s = "";
        recursion(root, alist, s);
        return alist;
    }

    public static void recursion(TreeNode root, ArrayList<String> alist, String s){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            alist.add(s+root.val);
        }
        if(root.left != null){
            recursion(root.left, alist,  s+root.val+"->");
        }
        if(root.right != null){
            recursion(root.right, alist, s+root.val+"->");
        }
        
    }
}