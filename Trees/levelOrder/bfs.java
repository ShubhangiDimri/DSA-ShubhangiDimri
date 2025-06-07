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
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> v = new ArrayList<>();
      Queue<TreeNode> q= new LinkedList<>();
      if(root==null){
        return v;
      }
      q.add(root);
      while(!q.isEmpty()){
         int size = q.size(); // number of nodes in current level
        List<Integer> level = new ArrayList<>();
        for (int i = 0; i < size; i++){
      TreeNode curr= q.poll(); //take out the first nodefrom the queue and save the value to the list then check for its left and rightchild and add them to the queue.
      level.add(curr.val);
      if(curr.left!=null){
        q.add(curr.left);
      }
      if(curr.right!=null){
        q.add(curr.right);
      }
      }
      v.add(level);
      }
        return v;
    }
}
