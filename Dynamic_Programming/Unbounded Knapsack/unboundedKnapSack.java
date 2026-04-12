// import java.util.Arrays;

// class Hello{
//     public static void main(String[] args){
//     int wt[]={2,3,4,5};
//     int val[]={1,4,5,7};
//     int W=7;
//     int n= wt.length;
//     int[][] dp= new int[n+1][W+1];
//     for(int i=0;i<=n;i++){
//         Arrays.fill(dp[i],-1);
//     }
//     int profit= unbounded(n,wt,val,W,dp);
//     System.out.println("maxprofit is:" +profit);

//     }
//     public static int unbounded(int n, int[] wt, int[] val, int W,int[][]dp){
//         if(n==0 || W==0) return 0;

//         if(dp[n][W]!=-1){
//             return dp[n][W];
//         }

//         if(W>=wt[n-1]){
//             return dp[n][W]=Math.max(val[n-1]+unbounded(n,wt,val, W-wt[n-1],dp),unbounded(n-1,wt,val,W,dp));
//         }else{
//             return dp[n][W]=unbounded(n-1,wt,val,W,dp);
//         }

//     }


// }

//top down

class Hello{
    public static void main(String[] args){
     int[] wt={2,3,4,5};
     int[] val={1,4,5,7};
     int W=7;
     int n=wt.length;
     System.out.println("value is :" +unboundedKnapsack(wt,val,W,n));
     
    }
    public static int unboundedKnapsack(int[] wt, int[] val, int W, int n){
        int[][] dp= new int[n+1][W+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(j>=wt[i-1]){
                    dp[i][j]= Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}
