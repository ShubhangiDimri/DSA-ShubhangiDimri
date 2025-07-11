class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal);
        //if goal appears anywhere inside s+s return true.
      //When we double the string s ( "abcde" to "abcdeabcde") every rotation of s appears as a substring in this doubled string. So if goal is a substring of s + s, it means s can be rotated to become goal.


    }
}
