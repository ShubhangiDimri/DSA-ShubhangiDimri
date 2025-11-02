public class SubsetSum {
    public static void main(String[] args) {
         int arr[] = {3, 34, 4, 12, 5, 2};
         int sum = 9;
          if (subsetExists(arr, sum))
            System.out.println("Subset with the given sum exists.");
        else
            System.out.println("No subset with the given sum exists.");


    }
    public static boolean subsetExists(int arr[], int sum){
        int n= arr.length;
        boolean[][] dp= new boolean[n+1][sum+1];

        //basecase
        //sum=0 is always possible by taking empty set
        for(int i=0;i<=n;i++){
            dp[i][0]= true;

        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                // If current element is greater than sum, we can’t include it
                if(arr[i-1]>j){
                    dp[i][j]= dp[i-1][j];
                }else{
                    //either include it or exclude it
                    dp[i][j]= dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
            }
        }
        return dp[n][sum];

    }
}
