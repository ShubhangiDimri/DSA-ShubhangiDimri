import java.util.*;

public class cellCompetition {
    public static void main(String[] args) {
        int d=1;
        int[] arr={1,0,0,0,0,1,0,0};
        System.out.println(Arrays.toString(cell(arr,d)));
    }
    public static int[] cell(int[]arr, int d){
        int n=arr.length;
        for(int day=0;day<d;day++){
            int [] ans= new int[n];
        for(int i=0;i<n;i++){
            int left= (i==0)?0 :arr[i-1];
            int right= (i==n-1)?0 :arr[i+1];

            if(left==right){
                ans[i]=0;
            }else{
                ans[i]=1;
            }

        }
        arr= ans;
    }
        
        
        return arr;

    }

    
}
