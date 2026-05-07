import java.util.*;
public class AlternateSorting {
    public static void main(String[] args) { 
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();

    }
    Arrays.sort(arr);
    int l=0;
    int r=n-1;
    int[] result= new int[n];
    int idx=0;
      while (l <= r) {
            if (idx < n)
                result[idx++] = arr[r--];   //max

            if (l <= r && idx < n)
                result[idx++] = arr[l++];   //min
        }

    for(int x:result){
        System.out.println(x+" ");
    }
}

    
}
