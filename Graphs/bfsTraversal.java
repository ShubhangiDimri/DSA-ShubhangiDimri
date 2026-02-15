import java.util.*;

class bfsTraversal {

    public static void main(String[] args) {

        int n = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // create n+1 lists (1-based indexing)
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        // edges
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> ans = bfs(1, adj, n);
        System.out.println(ans);
    }

    public static ArrayList<Integer> bfs(int start,
            ArrayList<ArrayList<Integer>> adj, int n){

        ArrayList<Integer> bfs = new ArrayList<>(); // store answer
        boolean[] vis = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);   //store traversal

            for(int it : adj.get(node)){
                if(!vis[it]){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
