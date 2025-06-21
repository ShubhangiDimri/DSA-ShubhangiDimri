class Solution {
    public int[] searchRange(int[] nums, int target) {
    //first occurrence (leftmost index) of target
    int first=findIndex(nums,target,true);
    //last occurrence (rigthmost index) of target
    int last= findIndex(nums,target,false);
    return new int[]{first,last};
        
    }
    // Helper function to find either first or last index of target
    private int findIndex(int[] nums, int target, boolean findFirst){
        int start=0, end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(nums[mid]==target){
                index=mid;
                if(findFirst){
                    end=mid-1; //move left to find earlier occurrence
                }
                else{
                    start=mid+1;//move right to find last occurrence
                }
            }else if (nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return index;
    }
}
