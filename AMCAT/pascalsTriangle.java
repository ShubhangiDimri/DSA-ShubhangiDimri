

public class pascalsTriangle {
    public static void main(String[] args) {

        int numRows = 5;

        int[][] result = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            result[i] = new int[i + 1];
            result[i][0] = 1;      // first element
            result[i][i] = 1;      // last element

            for (int j = 1; j < i; j++) {
                result[i][j] = result[i - 1][j] + result[i - 1][j - 1];
            }
        }

        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
