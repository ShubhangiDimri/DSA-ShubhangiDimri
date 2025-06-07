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
    public List<Integer> rightSideView(TreeNode root) {
    List<Integer> v= new ArrayList<>();
    rightView(root,v,0);
    return v;
    }
    public void rightView(TreeNode curr, List<Integer> v, int level){
        if(curr==null){
            return;
        }
        if(level==v.size()){  // If this is the first node at this level
            v.add(curr.val);
        }
        rightView(curr.right,v,level+1);//visit right first then left
         rightView(curr.left,v,level+1);
    }
}
