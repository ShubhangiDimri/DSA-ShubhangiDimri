class Solution {
    public int cutRod(int[] price) {
        int n=price.length;
         int[][] dp= new int[n+1][n+1];
         
         
         //dp array in java is already initialised as 0 by defualt so no need to do it again for the first row and first col
    
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(j>=i){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-i],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][n];
    }
       
}
