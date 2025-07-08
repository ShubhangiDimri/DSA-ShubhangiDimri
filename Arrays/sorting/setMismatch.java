class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
       while(i<nums.length){
            int corr=nums[i]-1;
            if( nums[i]!=nums[corr]){ 
                swap(nums,i,corr);
            
            } else{
                i++;
            }

        }
        for( i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
               return new int[] {nums[i],i+1};
            }
        }
        return new int[] {-1,-1};

    }
    private void swap(int[] arr, int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

}
    
