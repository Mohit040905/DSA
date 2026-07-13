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
    public boolean symm(TreeNode Node1, TreeNode Node2){
        if(Node1 == null && Node2 == null) return true;
        if(Node1 == null || Node2 == null) return false;
        if(Node1.val != Node2.val) return false;
        return symm(Node1.left, Node2.right) && symm(Node2.left, Node1.right);
    }
    public boolean isSymmetric(TreeNode root) {
        return symm(root.left , root.right);
    }
}