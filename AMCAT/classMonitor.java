
import java.util.*;
public class classMonitor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(count(arr,n));
    }
    public static int count(int[] arr, int n){
        int count=1;
        int min= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                count++;
            }
        }
        return count;
    }


}
