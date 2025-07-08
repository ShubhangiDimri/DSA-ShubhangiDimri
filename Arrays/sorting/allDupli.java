class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> ans= new ArrayList<>();
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
                ans.add(nums[i]);
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
