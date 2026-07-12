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
    public List<List<Integer>> dfs (TreeNode root, int target, List path, List ans){
        if(root==null) return ans;
        path.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val == target) ans.add(new ArrayList<>(path));
        }
        dfs(root.left, target - root.val, path ,ans);
        dfs(root.right, target-root.val, path, ans);
        path.remove(path.size()-1);
        return ans;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
       List<Integer> path = new ArrayList<>();
       List<Integer> ans = new ArrayList<>();
       return dfs(root, targetSum, path, ans); 
    }
}