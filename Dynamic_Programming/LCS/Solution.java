//recursive
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m= text1.length();
        int n= text2.length();
        return LCS(text1,text2,m,n);


    }
    public int LCS(String x,String y, int m, int n){
        if(n==0 || m==0){
            return 0;
        }
        
        if(x.charAt(m-1) == y.charAt(n-1)){
            return  1+LCS(x,y,m-1,n-1);
        }else{
            return Math.max(LCS(x,y,m,n-1),LCS(x,y,m-1,n));
        }
    }
}


//memo
class Solution {
    Integer[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int m= text1.length();
        int n= text2.length();
        dp= new Integer[m+1][n+1];
        return LCS(text1,text2,m,n);


    }
    public int LCS(String x,String y, int m, int n){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[m][n]!=null){
            return dp[m][n];
        }
        
        if(x.charAt(m-1) == y.charAt(n-1)){
            return dp[m][n]= 1+LCS(x,y,m-1,n-1);
        }else{
            return dp[m][n]= Math.max(LCS(x,y,m,n-1),LCS(x,y,m-1,n));
        }
    }
}
//tabulation
class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int m= text1.length();
        int n= text2.length();
        dp= new int[m+1][n+1];
       
      for(int i=0;i<m+1;i++){
        for(int j=0;j<n+1;j++){
            if(j==0 || i==0){
                dp[i][j]=0;
            }
        }

      }
      for(int i=1;i<m+1;i++){
        for(int j=1;j<n+1;j++){
            if(text1.charAt(i-1)==text2.charAt(j-1)){
                dp[i][j]= 1+dp[i-1][j-1];
            }else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
      }
      return dp[m][n];
    }
}
