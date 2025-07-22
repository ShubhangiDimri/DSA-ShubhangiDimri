//implement satck using arrays 

class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if(top>=999){
            System.out.println("size exceeded");
        }
        top=top+1;
        arr[top]=x;
    }

    public int pop() {
        // Your Code
        if(top==-1){
            return -1;
        }
        int val=arr[top];//need to store so that we can return the stored value
        top=top-1;
        return val;
    }
}


//implement stack using linked list
class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode temp=new StackNode(a);
        temp.next=top;
        top=temp;
        
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(top==null) return -1;
        int val=top.data;
        top=top.next;
        return val;
      
    }
}
//implement stack using queues
class MyStack {
 Queue<Integer> q= new LinkedList<>();
    public MyStack() {
      
    }
    
    public void push(int x) {
        int s=q.size();
        q.add(x);
        for(int i=0;i<s;i++){
            q.add(q.peek());//adds the front element again at the end
            q.remove();//removes the front bcz we just added it at the back
        }
    }
    
    public int pop() {
     return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
     return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

