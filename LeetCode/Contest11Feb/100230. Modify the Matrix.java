class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        
        for(int i = 0; i <c;i++){
            int max = -1;
            for(int j = 0; j < r; j++){
                if(matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }
            for(int j = 0; j < r; j++){
                if(matrix[j][i] == -1)
                    matrix[j][i] = max;
            }
        }ac
        return matrix;
    }
}
