class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;//no of rows
        int n=grid[0].length;//no of cols
        int row=m-1;//lastrow
        int col=0;//first col
        int count=0;
        while(row>=0 && col<n){
            if(grid[row][col]<0){
                count+=n-col;
                row--;
            }
            else{
                col++;


            }
        }
        return count;

    }
}
