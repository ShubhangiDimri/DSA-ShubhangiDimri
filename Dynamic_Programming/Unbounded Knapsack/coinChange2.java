class Solution {

    public int minCoins(int coins[], int sum) {

        int n=coins.length;
        int[][] dp= new int[n+1][sum+1];
        
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int j=1;j<=sum;j++){
            dp[0][j]=Integer.MAX_VALUE-1;  //-1 bec of overflow
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(j>=coins[i-1]){
                    dp[i][j]= Math.min(1+dp[i][j-coins[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
          return dp[n][sum] == Integer.MAX_VALUE - 1 ? -1 : dp[n][sum];
    }
}
