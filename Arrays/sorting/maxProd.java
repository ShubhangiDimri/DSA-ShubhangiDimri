class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int maxIndex= i;
            for( int j=i+1;j<n;j++){
                if(nums[j]<nums[maxIndex]){
                    maxIndex=j;
                }
            }
            //swap
            int temp=nums[i];
            nums[i]=nums[maxIndex];
            nums[maxIndex]=temp;
        }
    //two largest no are at the end
    int max1=nums[n-1];
    int max2=nums[n-2];
    return (max1-1)*(max2-1);
    }
}
