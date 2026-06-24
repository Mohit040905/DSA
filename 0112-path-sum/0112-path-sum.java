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
    public boolean sum(int target, TreeNode root){
        if(root==null) return false;
        if(root.left == null && root.right== null ){
            if(root.val == target) return true;
            //else return false;
        }
        return (sum(target-root.val, root.left)||sum(target-root.val, root.right));


    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(sum(targetSum, root)) return true;
        return false;
    }
}