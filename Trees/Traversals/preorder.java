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
    void preorder(ArrayList<Integer> v,TreeNode root)
    {
        if(root==null)
        return;
        v.add(root.val);
        preorder(v,root.left);
        preorder(v,root.right);
    }
    class Solution{
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> v=new ArrayList<>();
        if(root==null){
        return v;
        }
        v.add(root.val);
        v.addAll(preorderTraversal(root.left));
        v.addAll(preorderTraversal(root.right));
        return v;
    }
}
