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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> v= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        boolean leftToRight=true;//flag
        if(root==null){
            return v;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size= q.size();
            List<Integer> level= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr= q.poll();
                if(leftToRight){
                    level.add(curr.val);
                }
                else{
                    level.add(0,curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            v.add(level);
            leftToRight=!leftToRight;//toggle(true becomes false and vice versa)
        }
        return v;

    }
}
