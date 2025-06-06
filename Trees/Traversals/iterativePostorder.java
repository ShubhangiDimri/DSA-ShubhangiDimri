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

//using one stack
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> v = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        TreeNode lastvisited = null;

        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                TreeNode peekNode = st.peek();//look at the top element of the stack without removing it from the stack
                if (peekNode.right != null && lastvisited != peekNode.right) {
                    curr = peekNode.right;
                } else {
                    v.add(peekNode.val);
                    lastvisited = st.pop();
                  
                    

                }
            }

        }
        return v;

    }
}
