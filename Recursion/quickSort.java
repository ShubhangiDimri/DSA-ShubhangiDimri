import java.util.Arrays;

public class quickSort{
    public static void main(String[] args) {
        int[] arr={5,4,3,7,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
static void sort(int[] nums,int low,int high){
    if(low>=high){
        return;
    }

    int s= low;
    int e=high;
    int m=s+(e-s)/2;
    int pivot= nums[m];

    while(s<=e){

        //if it is already sorted it will not swap
        while(nums[s]<pivot){
            s++;
        }
        while(nums[e]>pivot){
            e--;
        }
        if(s<=e){
            int temp= nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;

        }
         
    }
 //now pivot is at correct index, sort two halves now
    sort(nums,low,e);//e ends up pointing at the end of the left partition


    sort(nums,s,high);//s ends up pointing at the start of the right partition
}

}
