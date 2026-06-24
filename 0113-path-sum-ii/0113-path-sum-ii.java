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
    public List<List<Integer>> dfs(TreeNode root, int targetSum, List path, List answer){
        
        if(root==null) return answer;
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum == root.val) answer.add(new ArrayList<>(path));
        }
        
        dfs(root.left, targetSum-root.val, path, answer);
        dfs(root.right, targetSum-root.val, path, answer);
        path.remove(path.size()-1);
        return answer;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        return dfs(root, targetSum, path, answer);
    }
}