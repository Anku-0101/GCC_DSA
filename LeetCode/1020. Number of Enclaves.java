class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];

        for(int i = 0; i <m; i++){
            for(int j = 0; j < n; j++){
                if((i == 0 || j == 0 || i == m-1 || j == n-1) && !visited[i][j] && grid[i][j] == 1){
                    dfs(i,j,visited,grid);
                }
            }
        }
        int res = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                //System.out.print(visited[i][j] + " ");
                if(grid[i][j] == 1 && !visited[i][j]){
                    res++;
                }
            }
            //System.out.println();
        }
        return res; 
    }

    void dfs(int row, int col, boolean[][] visited, int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        visited[row][col] = true;

        int[] drow = {1,0,-1,0};
        int[] dcol = {0,1,0,-1};
        for(int i =0; i<4; i++){
            int _row = drow[i]+row;
            int _col = dcol[i]+col;

            if(_row >= 0 && _col >= 0 && _row < m && _col < n && !visited[_row][_col] && grid[_row][_col] == 1){
                dfs(_row, _col, visited, grid);
            }
        }
    }
}
/*
[
    [0,0,0,1,1,1,0,1,0,0],
    [1,1,0,0,0,1,0,1,1,1],
    [0,0,0,1,1,1,0,1,0,0],
    [0,1,1,0,0,0,1,0,1,0],
    [0,1,1,1,1,1,0,0,1,0],
    [0,0,1,0,1,1,1,1,0,1],
    [0,1,1,0,0,0,1,1,1,1],
    [0,0,1,0,0,1,0,1,0,1],
    [1,0,1,0,1,1,0,0,0,0],
    [0,0,0,0,1,1,0,0,0,1]]
*/
