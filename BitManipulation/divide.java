class Solution {
    public int divide(int dividend, int divisor) {
       // Handle divisor 1 and -1 cases early
        if (divisor == 1) return dividend;
        if (divisor == -1) {
            return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend;
        }
        if(dividend==divisor){
            return 1;
        }
        boolean sign=true;//means positive
       if ((dividend >= 0 && divisor < 0) || (dividend <= 0 && divisor > 0)) {
            sign = false; // negative result
        }

        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        int ans=0;
        while(n>=d){
            int count=0;
            while(n>=d<<(count+1)){
                count++;
            }
                ans+=1<<count;
                n=n-(d*(1<<count));
        }
            if (ans > Integer.MAX_VALUE) {
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return sign ? ans : -1*ans;
    }
}
