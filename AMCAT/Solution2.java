import java.util.*;

class Solution2 {

    public static int[] alternateSort(int[] arr) {

        // Write your logic here
        Arrays.sort(arr);
        int j=0;
        int[] ans= new int[(arr.length+1)/2];
        for(int i=0;i<arr.length;i+=2){
            ans[j]=arr[i];
            j++;

        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr1 = {5,1,4,2,3};
        int[] arr2 = {9,7,2,4};
        int[] arr3 = {10};
        int[] arr4 = {};

        // Call function here + print results
        System.out.println(Arrays.toString(alternateSort(arr1)));
        System.out.println(Arrays.toString(alternateSort(arr2)));
        System.out.println(Arrays.toString(alternateSort(arr3)));
        System.out.println(Arrays.toString(alternateSort(arr4)));
    }
}