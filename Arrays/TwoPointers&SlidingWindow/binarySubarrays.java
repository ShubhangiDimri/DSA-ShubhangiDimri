class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
    private int atMost(int[] nums, int goal){
         int l=0,r=0,sum=0, count=0;
         if(goal<0) return 0;
       for( r=0;r<nums.length;r++){
        sum+=nums[r];
        while(sum>goal){
            sum-=nums[l];
            l++;
       }
        count+=r-l+1;
        }
      
       return count; 
    }
    
}
