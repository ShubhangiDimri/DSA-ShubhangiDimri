class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int maxArea=0;
        int n=heights.length;
        for(int i=0;i<n;i++){
            //Process stack while current bar is smaller than top of stack
            while(!st.isEmpty() && heights[i]<heights[st.peek()]){
                int bar=st.pop();//index
                int pse=st.isEmpty() ? -1:st.peek();
                int nse= i;//current index is next smaller element
                maxArea=Math.max(heights[bar] * (nse - pse - 1),maxArea);
            }
            st.push(i);
        }
        //for remaining bars in the stack
        while(!st.empty()){
            int bar=st.pop();
            int pse=st.isEmpty() ? -1:st.peek();
            int nse=n;
            maxArea=Math.max(heights[bar] * (nse - pse - 1),maxArea);


        }
        return maxArea;

    }
}
