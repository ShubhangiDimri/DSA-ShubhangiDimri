class Solution {  //cyclic sort
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans= new ArrayList<>();//because of the variable length ans
         int i=0;
        while(i<nums.length){
            int corr=nums[i]-1;
            if(corr<nums.length && nums[i]!=nums[corr]){ //corr should be within bounds
                swap(nums,i,corr);
            
            }else{
                i++;
            }

        }
        for(i=0;i<nums.length;i++){
          if(nums[i]!=i+1){
            ans.add(i+1);
          }

        }
        return ans;
    }
        private void swap(int[] arr, int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

}
    
