// Last updated: 8/12/2026, 11:18:14 AM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        preorder(root,res);
        return res;
    }
    public void preorder(TreeNode node,List<Integer> res){
        if(node==null){
            return;
        }
        res.add(node.val);
        preorder(node.left,res);
        preorder(node.right,res);
    }
}