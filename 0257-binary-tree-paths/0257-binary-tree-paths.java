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
    public static String makePath(ArrayList<Integer> arr){
        StringBuilder sb = new StringBuilder();
        sb.append(arr.get(0));
        for(int i = 1; i<arr.size(); i++){
            sb.append("->");
            sb.append(arr.get(i));
        }
        return sb.toString();
    } 
    public static void dfs(TreeNode root, ArrayList<Integer> arr , ArrayList<String> ans ){
        if(root==null) return;
        arr.add(root.val);
        if(root.left==null && root.right==null){
            ans.add(makePath(arr));
        }
        dfs(root.left, arr, ans);
        dfs(root.right, arr, ans);
        arr.remove(arr.size()-1);
    } 
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr , ans);
        return ans;
    }
}