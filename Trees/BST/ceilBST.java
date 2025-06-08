/* class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
} */

class Tree {
    int findCeil(Node root, int key) {
        int ceil=-1;
        while(root!=null){
            if(root.data==key){
                ceil= root.data;
                return ceil;
            }
            if(key<root.data){
                ceil=root.data;//This could be the answer
                root=root.left; //try out finding smaller one
            }
            else{
                root=root.right;
            }
        }
        return ceil;
    }
}
