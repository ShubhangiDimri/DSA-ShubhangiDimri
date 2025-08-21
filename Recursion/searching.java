public class linear{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int target=5;
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
         System.out.println(findIndexFromLast(arr, target,arr.length-1));

    }
    static boolean find(int[] arr,int target,int i){
        if(i==arr.length){
            return false;
        }
        return arr[i]==target || find(arr,target,i+1);
    }
    static int findIndex(int[] arr, int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }else{
            return findIndex(arr,target,i+1);
        }
    }
    static int findIndexFromLast(int[] arr,int target,int i){
        if(i==-1){
        return -1;
        }
        if(arr[i]==target){
            return i;
        }else{
            return findIndexFromLast( arr,target,i-1);
        }
    }

}
