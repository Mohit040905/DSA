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
    
    public static void dfs(TreeNode root, StringBuilder sb , ArrayList<String> ans ){
        if(root==null) return;
        int len = sb.length();
        
        
        if(root.left==null && root.right==null){
            sb.append(root.val);
            ans.add(sb.toString());
        }
        sb.append(root.val);
        sb.append("->");
        dfs(root.left,  sb, ans);
        dfs(root.right,  sb, ans);
        sb.setLength(len);
    } 
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(root, sb, ans);
        return ans;
    }
}