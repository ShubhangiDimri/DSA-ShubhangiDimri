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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> v=new ArrayList<>();
        if(root==null){
            return v;
        }
        v.addAll(inorderTraversal(root.left));
        v.add(root.val);
        v.addAll(inorderTraversal(root.right));
        return v;

        
    }
}
