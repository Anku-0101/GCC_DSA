class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == '1'){
                    res++;
                    bfs(grid, i, j);
                }
            }
        }
        return res;
    }

    public void bfs(char[][] grid, int row, int col){
        int m = grid.length;
        int n = grid[0].length;

        grid[row][col] = '0';
        int i = row;
        int j = col;

        if(i+1 < m && grid[i+1][j] == '1') bfs(grid,i+1,j);
        if(i-1 >= 0 && grid[i-1][j] == '1') bfs(grid,i-1,j);
        if(j+1 < n && grid[i][j+1] == '1') bfs(grid,i,j+1);
        if(j-1 >= 0 && grid[i][j-1] == '1') bfs(grid,i,j-1);
        
        //if(i+1 < m && j+1 < n && grid[i+1][j+1] == '1') bfs(grid,i+1,j+1);
        //if(i+1 < m && j-1 >= 0 && grid[i+1][j-1] == '1') bfs(grid,i+1,j-1);
        
        //if(i-1 >= 0 && j+1 < n && grid[i-1][j+1] == '1') bfs(grid,i-1,j+1);
        //if(i-1 >= 0 && j-1 >= 0 && grid[i-1][j-1] == '1') bfs(grid,i-1,j-1);

        // for(int i = row; i < grid.length; i++){
        //     for(int j = col; j < grid[0].length; j++){
        //         if(i+1 < m && grid[i+1][j] == '1') bfs(grid,i+1,j);
        //         if(i-1 >= 0 && grid[i-1][j] == '1') bfs(grid,i-1,j);
        //         if(i+1 < m && j+1 < n && grid[i+1][j+1] == '1') bfs(grid,i+1,j+1);
        //         if(i+1 < m && j-1 >= 0 && grid[i+1][j-1] == '1') bfs(grid,i+1,j-1);
        //         if(j+1 < n && grid[i][j+1] == '1') bfs(grid,i,j+1);
        //         if(j-1 >= 0 && grid[i][j-1] == '1') bfs(grid,i,j-1);
        //         if(i-1 >= 0 && j+1 < n && grid[i-1][j+1] == '1') bfs(grid,i-1,j+1);
        //         if(i-1 >= 0 && j-1 >= 0 && grid[i-1][j-1] == '1') bfs(grid,i-1,j-1);
        //     }
        // }
    }
}
