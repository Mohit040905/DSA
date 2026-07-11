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
class pair{
    TreeNode node;
    int level;
    pair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root , 0));
        int currentlev = 0;
        List<Integer> current = new ArrayList<>() ;
        while(q.size()>0){
            pair front = q.remove();
            if(front.level != currentlev){ 
                ans.add(current);
                currentlev = front.level;
                current = new ArrayList<>();
            }
            current.add(front.node.val); 
            
            if(front.node.left != null) q.add(new pair(front.node.left, front.level+1));
            if(front.node.right != null) q.add(new pair(front.node.right, front.level+1));

        }
        ans.add(current);
        return ans;
    }
}