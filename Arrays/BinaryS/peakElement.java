class Solution {
    public int findPeakElement(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int mid= s+(e-s)/2;
            if(nums[mid]>nums[mid+1]){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }
}
