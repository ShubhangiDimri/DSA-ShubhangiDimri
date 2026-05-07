

    class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);
        reverse(0,nums.length-1,nums);


        
    }

    public void reverse(int s, int e, int[] nums){
        int i=s;
        int j=e;
        while(i<j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}

