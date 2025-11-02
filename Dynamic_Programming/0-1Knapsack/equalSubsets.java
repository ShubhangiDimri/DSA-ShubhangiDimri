public class PartitionEqualSubset {
    
    public static void main(String[] args) {
        int[] arr={1,5,11,5};
        int sum=11;
        if (equal(arr, sum))
            System.out.println("equal partitions are there");
        else
            System.out.println("No possibility of equal partition because of the total sum is odd");
    }
    public static boolean equal(int arr[], int sum){
        sum=0;
        for(int i=0;i<arr.length;i++){
            sum= sum+arr[i];
        }
        if(sum%2!=0){ //odd sum
         return false;
        }
        else{ //even sum
            return subsetExists(arr,sum/2);
        }
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
