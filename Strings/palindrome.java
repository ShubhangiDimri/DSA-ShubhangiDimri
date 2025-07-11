class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false; //if the number is negative like -121
        }
        String numstr=Integer.toString(x);
        for(int i=0;i<numstr.length()/2;i++){
          char start= numstr.charAt(i);
          char end= numstr.charAt(numstr.length()-1-i); //both the pointers will move inwards
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
