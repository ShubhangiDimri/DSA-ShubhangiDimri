class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;//no zero found
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                //swap(nums[i],nums[j]); java is pass by value so it doesnt work need to do it manually.
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        
        
    }
}
