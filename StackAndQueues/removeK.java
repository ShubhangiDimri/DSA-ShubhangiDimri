class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<num.length();i++){
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i)){
                st.pop();
                k--;

            }
            st.push(num.charAt(i));
        }
        while(k-->0) st.pop();
        //building result from the stack
        StringBuilder sb= new StringBuilder();
        for(char digit:st){
            sb.append(digit);
        }
        //remove leading zeroes
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);

        }
       if (sb.toString().equals(""))
         return "0";
        else
        return sb.toString();
    }
}
