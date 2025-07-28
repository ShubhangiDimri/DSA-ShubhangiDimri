class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums1.length];
        Map<Integer,Integer> nge= new HashMap<>();
    
    //stack helps to find the next greater element for each no in nums2
    //map stores the result so we can quickyly get ans for any no in nums1
   for(int i=nums2.length-1;i>=0;i--){
    while(!st.isEmpty() && st.peek()<=nums2[i]){
        st.pop();
    }
    if(st.isEmpty()) nge.put(nums2[i],-1);
    else nge.put(nums2[i],st.peek());
    st.push(nums2[i]);

   }
   for(int i=0;i<nums1.length;i++){
    ans[i]=nge.get(nums1[i]);
   }
   return ans;

    }
}  
//tc=o(m+n) m is the length of nums2 and n is yhe length of nums1
