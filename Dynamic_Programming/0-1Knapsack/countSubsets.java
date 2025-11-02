//recursive

public class countSubsets {
    public static void main(String[] args) {
        int arr[]={2,3,5,6,8,10};
        int sum=10;
        int n=arr.length;
        System.out.println(subsets(arr, n, sum));
    }
    public static int subsets(int arr[], int n,int sum){
      if(sum==0){
        return 1; //empty set exists*(true)
      }
      if(n==0){
        return 0; //false
      }
      if(arr[n-1]<=sum){ //include or exclude
      return subsets(arr,n-1,sum- arr[n-1])+ subsets(arr,n-1,sum);
      }else{
        return subsets(arr,n-1,sum);
      }
    }
}
//memoized
import java.util.Arrays;
public class countSubsets{
    static int[][] dp; //dp[n][sum]
    public static void main(String[] args) {
         int arr[]={2,3,5,6,8,10};
        int sum=10;
        int n=arr.length;
        dp= new int[n+1][sum+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        System.out.println(subsets(arr, n, sum));
    }
    public static int subsets(int arr[],int n,int sum){
         if(sum==0){
        return 1; //empty set exists*(true)
      }
      if(n==0){
        return 0; //false
      }
      //if computed already return stored result
      if(dp[n][sum]!=-1){
        return dp[n][sum];
      }
       if(arr[n-1]<=sum){ //include or exclude
      dp[n][sum]= subsets(arr,n-1,sum- arr[n-1])+ subsets(arr,n-1,sum);
      }else{
        dp[n][sum]= subsets(arr,n-1,sum);
      }
      return dp[n][sum];
    }
}
//tabulation
public class countSubsets {

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 8, 10};
        int sum = 10;
        int n = arr.length;

        System.out.println(countSubsets(arr, n, sum));
    }

    public static int countSubsets(int[] arr, int n, int sum) {
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) { //include or exclude
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];

    }
}
