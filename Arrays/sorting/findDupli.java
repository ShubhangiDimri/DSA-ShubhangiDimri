class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int corr=nums[i]-1;
            if( nums[i]!=nums[corr]){ 
                swap(nums,i,corr);
            
            }else{
                if (i != corr) { //If nums[i] == nums[correct] but i != correct → duplicate found
                    return nums[i];
                }
                i++;
            }

        }
        return -1;

    }
       
        private void swap(int[] arr, int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

}
    
