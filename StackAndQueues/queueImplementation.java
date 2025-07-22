//Queue using array
class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = -1;
        rear = -1;
      
    }

    // Function to push an element x in a queue.
    void push(int x) {

    if(rear==-1){
      
        front=0;
        rear=0;
    }
    else{
       rear++;
      
    }
    arr[rear]=x;
        
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        
        
        if(front==-1) return -1;
        int val=arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
        return val;
    }
    
}

//
/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/



//Queue using linkedList
class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
	    QueueNode temp=new QueueNode(a);
	    if(front==null){
	        front=rear=temp;
	    }
	    else{
	        rear.next=temp;
	        rear=temp;
	    }
       
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(front==null) return -1;
	  int val=front.data;
	  front=front.next;
	  return val;
	  
       
	}
}

//Queue using stack
class MyQueue {
   Stack<Integer> s1= new Stack<>();
    Stack<Integer> s2= new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
            }
        }
       return s2.pop(); 
    }
    
    public int peek() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
            }
        }
      return s2.peek();
        
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty(); //queue is empty when these both are empty
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */






