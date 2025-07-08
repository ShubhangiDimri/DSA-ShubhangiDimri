class Solution {
    public int heightChecker(int[] heights) {
        int[] copy= new int[heights.length];//copy of the og array where we will apply sorting and then compare it with the original array
        for(int i=0;i<heights.length;i++){
            copy[i]=heights[i]; //copying eleements from the original array
        }
        for(int i=0;i<copy.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(copy[j]<copy[j-1]){
                swap(copy,j,j-1);
                }else{
                    break;
                }
            }
        }
        //comparing both arrays
        int diff=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=copy[i]){
                diff++;
            }
        }
        return diff;
    }
    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
