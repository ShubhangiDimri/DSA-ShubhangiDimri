class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> st= new ArrayList<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
           if(asteroids[i]>0){   //if positive
            st.add(asteroids[i]);
           }else{
            ////incase of arraylist =st.get(st.size()-1) to peek and st.remove(st.size()-1) to pop
            while(!st.isEmpty() && st.get(st.size()-1)>0 && st.get(st.size()-1)<Math.abs(asteroids[i])){
                st.remove(st.size()-1);
            }
            if(!st.isEmpty() && st.get(st.size()-1)==Math.abs(asteroids[i])){
              st.remove(st.size()-1); //this is the check where both the integers will be destroyed.

            }else if(st.isEmpty() || st.get(st.size()-1)<0){
                st.add(asteroids[i]); //only in this case we end up putting negative elements into the list
            }
           }
        }
        //return st;
       // List is a list of Integers, but the function must return int[]. Java treats int[] and List differently so need to convert list to an array
       int ans[]= new int[st.size()];
       for(int i=0;i<st.size();i++){
        ans[i]=st.get(i);
       }
       return ans;
    }
}
