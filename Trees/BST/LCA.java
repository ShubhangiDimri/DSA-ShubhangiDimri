/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){
            if(p.val<root.val && q.val<root.val){
                root= root.left;//Both nodes in left subtree
            }
           else if(p.val>root.val && q.val>root.val){
                root=root.right; //Both nodes are in right subtree
            }
            else{
                return root;//One node is on the left and one is on the right 
            }

        }
        return null;// Should never reach here if p and q are guaranteed to be in tree
    }
}
