class Solution {
    public int search(int[] nums, int target) {
        //pivot index
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid = s + (e - s) / 2;
            if(nums[mid]==target){
                return mid;
            }
            //if the left half is sorted
            if(nums[mid]>=nums[s]){
                //if target lies in the sorted left half
                if(nums[s]<=target && target<nums[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }

            }
            // If left is not sorted, then right must be sorted
            else{
                //if target lies in the sorted right half
                if(nums[mid]<target && target<=nums[e]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }


        }
        return -1;//If  target not found in  the entire array

    }
}
