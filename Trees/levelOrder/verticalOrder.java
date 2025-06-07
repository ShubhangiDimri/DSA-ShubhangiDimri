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
    class Tuple{
        TreeNode node;
        int x;//horizontal dis left to right
        int y;// vertical dist top to bottom
        public Tuple(TreeNode node, int x, int y ){
            this.node=node;
            this.x=x;
            this.y=y;
        }

    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        //x ke andar y and y ke andar priority queue(sorted node values)
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map= new TreeMap<>();
        Queue<Tuple> q= new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple t= q.poll();
            TreeNode node= t.node;
            int x= t.x;
            int y= t.y;
            //putting values in the map
            map.putIfAbsent(x,new TreeMap<>());
            map.get(x).putIfAbsent(y, new PriorityQueue<>());
            map.get(x).get(y).offer(node.val);
            //add left and right of that node in the queue with updated x and y
            if(node.left!=null){
                q.offer(new Tuple(node.left,x-1,y+1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right,x+1,y+1));
            } 
        }
        //final list from the map
        List<List<Integer>> res= new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> levelmap : map.values()){
            res.add(new ArrayList<>());
        for(PriorityQueue<Integer> nodes :levelmap.values()){
           while(!nodes.isEmpty()){
            res.get(res.size()-1).add(nodes.poll());
           }


        }
        }

        return res;

        
    }
}
