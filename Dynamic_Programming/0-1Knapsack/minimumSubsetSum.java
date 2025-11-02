public class MinimumSubsetSum{
    public static void main(String[] args) {
        int[] arr={1,6,11,5};
        System.out.println( "minimum diff is "+minimumSum(arr));
    }
    public static int minimumSum(int[] arr){
    //calculate total sum /range of the array
    int n= arr.length;
    int totalSum=0;
    for(int num: arr){
     totalSum+=num;
    }
    int target= totalSum/2;
    boolean[] dp= new boolean[target+1];
    //sum=0 is always possible
    dp[0]=true;

    //Subset Sum dp
        for (int num : arr) {
            for (int j = target; j >= num; j--) {
                //We go backwards to avoid using same element twice
                dp[j] = dp[j] || dp[j - num];
            }
        }
        //Find the largest possible s1 ≤ totalSum/2
        int s1 = 0;
        for (int j = target; j >= 0; j--) {
            if (dp[j]) {
                s1 = j;
                break;
            }
        }
        //minimize range
        int s2= totalSum-s1;
        int minDiff= Math.abs(s2-s1);
        return minDiff;


    }
}
