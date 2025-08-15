class Solution {
    public boolean isPowerOfTwo(int n) {
   //A number is a power of two if it has only one bit set in its binary form
   //means 8 is 1000,16 is 10000
   //if n&(n-1)==0, then n is a power of two
if(n>0 && (n&(n-1))==0){
    return true;
}


   return false;
    }
}
