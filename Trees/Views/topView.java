/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair {
    Node node;
    int y;

    Pair(Node node, int y) {
        this.node = node;
        this.y = y;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
    ArrayList<Integer> res= new ArrayList<>();
    if(root==null) return res;
    // Map to store horizontal distance (y) and corresponding node data
    TreeMap<Integer,Integer> map= new TreeMap<>();
    // Queue for level order traversal: stores (node, y)
    Queue<Pair> q= new LinkedList<>();
    q.offer(new Pair(root,0));
    while(!q.isEmpty()){
        Pair p = q.remove();
        int y= p.y;
        Node temp= p.node;
        if(!map.containsKey(y)){
            map.put(y,temp.data);
            
        }
        if(temp.left!= null){
            q.offer(new Pair(temp.left,y-1));
        }
         if(temp.right!= null){
            q.offer(new Pair(temp.right,y+1));
        }
        
    }
    // Add values from map to result (sorted by horizontal distance)
    for(int val: map.values()){
        res.add(val);
    }
    
    return res;
    
        
    }
}
