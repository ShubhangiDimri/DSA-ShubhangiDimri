class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res= new char [s.length()]; //to store the final result
        //placing char
        for(int i=0;i<s.length();i++){
            res[indices[i]]=s.charAt(i);
        }
        return new String(res);//converted char to string
    }
}
