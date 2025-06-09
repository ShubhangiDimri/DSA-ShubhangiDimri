class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=arr[0];
        int sLargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }
        return sLargest;
    }
}
