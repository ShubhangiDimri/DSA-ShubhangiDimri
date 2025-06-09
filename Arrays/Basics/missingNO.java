class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actualSum=0;
        int expectedSum= n*(n+1)/2;
        for(int i=0;i<n;i++){
            actualSum= actualSum+nums[i];
        }
       int missingNo= expectedSum-actualSum;
        return missingNo;
    }
    
}
