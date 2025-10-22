//recursive
class Recursive{
    public static void main(String[] args) {
        int wt[]={1,3,4,5};
        int val[]={1,4,5,7};
        int W=7;
        int n=wt.length;
       int maxProfit= knapsack(wt,val,W,n);
        System.out.println("Maximum value: " + maxProfit);
    }
    public static int knapsack(int wt[],int val[],int W,int n){
        if(n==0 || W==0){
            return 0;
        }
        if(wt[n-1]<=W){
            return Math.max(val[n-1]+knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1));
        }else  {
            return knapsack(wt, val, W, n-1);
            
        }
    }
}
//memoize
import java.util.Arrays;

public class Memoize {
    // declare memo table as static so we can use it inside static methods
    static int[][] t = new int[102][1002];


    public static void main(String[] args) {
         int wt[]  = {1, 3, 4, 5};
        int val[] = {1, 4, 5, 7};
        int W = 7;
        int n = wt.length;
        // Initialize table with -1
        for (int i = 0; i < t.length; i++) {
            Arrays.fill(t[i], -1);
        }
         int maxProfit = knapsack(wt, val, W, n);
        System.out.println("Maximum value: " + maxProfit);
    }
     
     public static int knapsack(int wt[],int val[],int W,int n){
        if(n==0 || W==0){
            return 0;
        }
        if(t[n][W]!=-1){
            return t[n][W];
        }
        if(wt[n-1]<=W){
             t[n][W]=Math.max(val[n-1]+knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1));
        }else  {
             t[n][W]=knapsack(wt, val, W, n-1);
            
        }
        return t[n][W];//is for speed,not for correctness
    //Without it, you’re just running a plain recursive knapsack

    }
    
}
