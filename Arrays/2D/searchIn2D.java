class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;//total no of rows
        int n=matrix[0].length;//no of columns in each row(2d ti 1d conversion)
        int low=0;
        int high=m*n-1; //m*n is total no of elements
        //binary search
        while(low<=high){
            int mid = low + (high - low) / 2;
            int row=mid/n;// convert the 1D index mid into its 2D row index
            int col=mid%n;//convert the 1D index mid into its 2D column index


            if(matrix[row][col]== target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}
