class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> v = new ArrayList<>();
        if (matrix.length == 0) return v;  //empty matrix

        int m = matrix.length;
        int n = matrix[0].length;
        int srow = 0, scol = 0, erow = m - 1, ecol = n - 1;

        while (srow <= erow && scol <= ecol) {
            // Top row
            for (int j = scol; j <= ecol; j++) {
                v.add(matrix[srow][j]);
            }

            // Right column
            for (int i = srow + 1; i <= erow; i++) {
                v.add(matrix[i][ecol]);
            }

            // Bottom row
            if (srow < erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    v.add(matrix[erow][j]);
                }
            }

            // Left column
            if (scol < ecol) {
                for (int i = erow - 1; i > srow; i--) {
                    v.add(matrix[i][scol]);
                }
            }

            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return v;
    }
}
