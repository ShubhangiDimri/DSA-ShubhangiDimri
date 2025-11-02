//recursive approach
public class JumpGame {
    public static void main(String[] args) {
        //int[] nums={2,3,1,1,4};
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[]nums){
        return canReachEnd(0, nums); //starting from 0th index
    }
    public static boolean canReachEnd(int i, int[] nums){
        int n= nums.length;
        //i is index here
        if(i>=n-1){
            return true; //at the last index or beyond it
        }
        if(nums[i]==0){ //it is not the end means youre stuck there
            return false;
        } //redundant edgecase 

        //try possible jumps
        for(int jump=1;jump<=nums[i];jump++){ 
            //jump=0 means no movement
            if(canReachEnd(i+jump,nums)){
                return true;
            }
           
        }
        return false;

    }
}

//memoized approach- top down 

import java.util.Arrays;

public class JumpGame {
     static int[] dp;  // -1 = not computed, 0 = false, 1 = true
    public static void main(String[] args) {
        //int[] nums={2,3,1,1,4};
        int[] nums={3,2,1,0,4};
        dp = new int[nums.length];
        Arrays.fill(dp,-1); //initialize
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[]nums){
        return canReachEnd(0, nums); 
    }
    public static boolean canReachEnd(int i, int[] nums){
        int n= nums.length;
        
        if(i>=n-1){
            return true; 
        }
     if(dp[i]!=-1){
        //already computed
        return dp[i]==1;
        
     }

        
        for(int jump=1;jump<=nums[i];jump++){ 
            if(canReachEnd(i+jump,nums)){
                dp[i]=1;
                return true;
            }
           
        }
        dp[i]=0;
        return false;

    }
}



//tabulation - bottom up
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }
public static boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
         // Base case: last index can always reach itself
        dp[n - 1] = true;
        
        //Fill dp from second last index to 0
        for (int i = n - 2; i >= 0; i--) {
            int maxJump = nums[i];
            for (int jump = 1; jump <= maxJump && i + jump < n; jump++) {
                if (dp[i + jump]) {
                    dp[i] = true;
                    break; 
                }
            }
        }

        return dp[0]; //can we reach from index 0 to end?
    }
}
