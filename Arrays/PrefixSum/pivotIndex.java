class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            if(leftSum==totalSum-leftSum-nums[i]){
                return i;
            } //totaSum=leftsum+nums[i]+rightsum{}
            leftSum+=nums[i];
        }
        return -1; // if condition not met
    }
}
