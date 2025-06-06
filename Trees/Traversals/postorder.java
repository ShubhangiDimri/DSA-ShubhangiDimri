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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> v= new ArrayList<>();
        if(root==null){
            return v;
        }
        v.addAll(postorderTraversal(root.left));
        v.addAll(postorderTraversal(root.right));
        v.add(root.val);
        return v;

    }
}
