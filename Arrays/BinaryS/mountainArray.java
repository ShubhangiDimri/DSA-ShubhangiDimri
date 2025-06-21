class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){    //means we are in dec part of the array
            end=mid; //check in left
            }
            if(arr[mid]<arr[mid+1]){      //we are in ascending part of array
                start=mid+1; 
            }

        }
        return start;  //At the end, start == end and pointing to the peak
    }
}
