class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] res= new int[n];
        int left=0;
        int right=n-1;
        int pos=n-1;//fill result from the end
        while(left<=right){
            int leftsq= nums[left]*nums[left];
            int rightsq= nums[right]*nums[right];
            if(leftsq>rightsq){
                res[pos]=leftsq;
                pos--;
                left++;
            }
            else{
                res[pos--]=rightsq;
                right--;
            }
        }
        return res;
        
    }
}
