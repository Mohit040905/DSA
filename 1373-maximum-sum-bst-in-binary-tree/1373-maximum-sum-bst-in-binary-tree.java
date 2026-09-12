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
class Quad {
    int sum;
    int min;
    int max;
    boolean isBST;

    Quad(int sum, int min, int max, boolean isBST) {
        this.sum = sum;
        this.min = min;
        this.max = max;
        this.isBST = isBST;
    }
}
class Solution {
    int ans = 0;
    public int maxSumBST(TreeNode root) {
        solve(root);
        return ans; 
    }
    Quad solve(TreeNode root) {

    // Base case: empty subtree
    if (root == null) {
        return new Quad(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);
    }

    // Get information about left and right subtrees
    Quad left = solve(root.left);
    Quad right = solve(root.right);

    // Check whether current subtree is a BST
    if (left.isBST && right.isBST &&
        root.val > left.max &&
        root.val < right.min) {

        // Current subtree is a valid BST
        int sum = root.val + left.sum + right.sum;

        // Update maximum BST sum
        ans = Math.max(ans, sum);

        // Return information to parent
        int min = Math.min(root.val, left.min);
        int max = Math.max(root.val, right.max);

        return new Quad(sum, min, max, true);
    }

    // Current subtree is NOT a BST
    return new Quad(0, Integer.MIN_VALUE, Integer.MAX_VALUE, false);
}
}