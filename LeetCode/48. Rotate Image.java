class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        // reverse row
        for(int i = 0; i<n; i++){
            int start = 0, end = n-1;
            while(start < end){
                int tmp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = tmp;
                start++;end--;
            }
        }
    }
}
