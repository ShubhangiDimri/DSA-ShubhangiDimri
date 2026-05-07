import java.util.*;

public class symmetricMatrix{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][] matrix= new int[n][n]; //square matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= sc.nextInt();

            }
        }

        boolean isSymm= true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    isSymm= false;
                    break;
                }
            }
        }
        if(isSymm){
            System.out.println("symmetricMatrix");
        }else{
            System.out.println("not a symmetricMatrix");
        }


        
    }

}