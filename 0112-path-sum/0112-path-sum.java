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
    public boolean inorder(TreeNode root, int target){
        if(root==null) return false;
        if(root.left==null&&root.right==null){
        if(root.val == target) return true;}
        return inorder(root.left, target-root.val) || inorder(root.right, target-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return inorder(root, targetSum);
    }
}