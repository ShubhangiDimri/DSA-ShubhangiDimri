class Solution {  //cyclic sort
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int corr=nums[i];
            if(corr<nums.length && nums[i]!=nums[corr]){ //corr should be within bounds
                swap(nums,i,corr);
            
            }else{
                i++;
            }

        }
        for(i=0;i<nums.length;i++){
          if(nums[i]!=i){
            return i;
          }

        }
        return nums.length;//if no number is missing from 0 to n-1, then the missing number is exactly n
    }
        private void swap(int[] arr, int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

}
