import java.util.*;

public class distinctDiagonal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][] matrix= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        HashSet<Integer> set= new HashSet<>();
        boolean distinct= true;
        for(int i=0;i<n;i++){
            //for(int j=0;j<n;j++){
                if(set.contains(matrix[i][i])){
                    distinct= false;
                    break;
                }
            //}
            set.add(matrix[i][i]);
        }

        if(distinct){
            System.out.println("distinct distinctDiagonal eleents");
        }else{
            System.out.println("not distinctDiagonal ekements");
        }

    }
}
