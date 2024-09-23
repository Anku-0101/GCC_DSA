class neighborSum {

    int[][] arr;
    HashMap<Integer, int[]> hm;
    int n;
    public neighborSum(int[][] grid) {
        this.arr = grid;
        n = grid.length;
        hm = new HashMap<>();
        for(int i = 0; i<n; i++){
            for(int j = 0; j <n; j++){
                hm.put(arr[i][j],new int[]{i,j});
            }
        }
    }
    
    public int adjacentSum(int value) {
        int[] indices = getIndices(value);
        int row = indices[0]; int col = indices[1];
        int sum = 0;

        if(col+1<n)sum += arr[row][col+1];
        if(col-1>-1)sum += arr[row][col-1];
        if(row+1<n)sum += arr[row+1][col];
        if(row-1>-1)sum += arr[row-1][col];
        return sum;
    }
    
    public int diagonalSum(int value) {
        int[] indices = getIndices(value);
        int row = indices[0]; int col = indices[1];
        int sum = 0;

        if(row+1 <n && col+1 <n)sum += arr[row+1][col+1];
        if(row-1 >-1 && col+1 <n)sum += arr[row-1][col+1];
        if(row-1 >-1 && col-1 >-1)sum += arr[row-1][col-1];
        if(row+1 <n && col-1 >-1)sum += arr[row+1][col-1];

        return sum;
    }

    private int[] getIndices(int value){
        return hm.get(value);
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */
