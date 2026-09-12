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
    static int sum;
    public void revinorder(TreeNode root){
        if(root == null ) return;
        revinorder(root.right);
        root.val += sum;
        sum = root.val;
        revinorder(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        revinorder(root);
        return root;
    }
}