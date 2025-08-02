class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int [] answer= new int[n];
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
             int idx=st.pop();
             answer[idx]=i-idx;//how many days passed between the previous cooler day (at idx) and today (at i)
             //basically we are storing indices not temperatures. so st.pop() gives the index position;


            }
            st.push(i);
        }
        return answer;
    }
}
