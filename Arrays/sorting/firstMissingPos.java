class Solution {//cyclic sort
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int corr=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[corr]){
                //ignore negatives
                swap(nums,i,corr);

            }else{
                i++;
            }

        }
        //searching missing no
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
            return i+1;
            }
        }
      return nums.length+1;
    }
    private void swap(int[] arr, int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

}
