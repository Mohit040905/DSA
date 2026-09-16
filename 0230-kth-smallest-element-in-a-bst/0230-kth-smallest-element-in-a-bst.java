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
    public void traverse(TreeNode root, PriorityQueue<Integer> pq, int k){
        if(root == null ) return;
        pq.add(root.val);
        if(pq.size()>k) pq.remove();
        traverse(root.left, pq , k);
        traverse(root.right, pq, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        traverse(root, pq, k );
        return pq.peek();
    }
}