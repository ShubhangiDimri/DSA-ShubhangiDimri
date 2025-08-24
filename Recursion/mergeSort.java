class mergeSort{

  public static void main(String[] args) {
    int[] arr={12,11,13,5,6,7};
    sort(arr,0,arr.length-1);
    // Print sorted array
    System.out.println("Sorted array:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
  public static void sort(int[]arr,int left, int right){
    if(left<right){
      int mid= (left+right)/2;
      //recursivey sort the first half
      sort(arr,left,mid);
      //recursively sort the second half
      sort(arr,mid+1,right);
      //merge two sorted halves
      merge(arr,left,mid,right);

    }
  }
  public static void merge(int[] arr,int left,int mid,int right){
    int n1= mid-left+1;//size of left subarray
    int n2=right-mid;//size of right subarray
  //creating temp arrays to copy data
    int[] L= new int[n1];
    int[] R= new int[n2];

    for(int i=0;i<n1;i++){
      L[i]= arr[left+i];
    }
    for(int j=0;j<n2;j++){
      R[j]= arr[mid+1+j];
    }

    //Merge the temp arrays back into arr[left..right]
    int i=0;//initial index of left subarray
    int j=0; //initial index of right subarray
    int k=left; //initial index of merged array

    while(i<n1 && j<n2){
      if(L[i]<R[j]){
        arr[k]=L[i];
        i++;
      }else{
        arr[k]=R[j];
        j++;
      }
      k++; //move to the next index in merged array
    }

    //copy remaining elements if any in any of the subarrays
    while(i<n1){
      arr[k]=L[i];
      i++;
      k++;
    }
     while(j<n2){
      arr[k]=R[j];
      j++;
      k++;
    }

  }
}
