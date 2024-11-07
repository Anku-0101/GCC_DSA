// TLE CODE, NEEDS OPTIMIZATION
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[m][n];

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] == 1){
                    res[i][j] = bfs(i,j,mat);
                }
            }
        }
        return res;
    }
    public int bfs(int start, int end, int[][] mat){
        Queue<Data> q = new LinkedList<>();
        q.add(new Data(start, end, 1));
        int m = mat.length;
        int n = mat[0].length;

        while(!q.isEmpty()){
            Data d = q.poll();
            int row = d.row, col = d.col, level = d.level;
            if(row+1 < m){
                if(mat[row+1][col] == 0){
                    return level;
                }
                q.add(new Data(row+1, col, level+1));
            }
            if(row-1  >= 0){
                if(mat[row-1][col] == 0){
                    return level;
                }
                q.add(new Data(row-1, col, level+1));
            }
            if(col-1  >= 0){
                if(mat[row][col-1] == 0){
                    return level;
                }
                q.add(new Data(row, col-1, level+1));
            }
            if(col+1  < n){
                if(mat[row][col+1] == 0){
                    return level;
                }
                q.add(new Data(row, col+1, level+1));
            }
        }
        return -1;
    }
}
class Data{
    int row,col,level;
    Data(int row, int col, int level){
        this.row = row;
        this.col = col;
        this.level = level;
    }
}


// Accepted

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        Queue<Data> q = new LinkedList<>();

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] == 0){
                    visited[i][j] = true;
                    q.add(new Data(i, j, 1));
                }
            }
        }
        bfs(q,mat,res,visited);
        return res;
    }
    public void bfs(Queue<Data> q, int[][] mat, int[][] res, boolean[][] visited){
        int m = mat.length;
        int n = mat[0].length;

        while(!q.isEmpty()){
            Data d = q.poll();
            int row = d.row, col = d.col, level = d.level;
            
            if(row+1 < m && mat[row+1][col] == 1 && !visited[row+1][col]){
                res[row+1][col] = level;
                visited[row+1][col]=true;
                q.add(new Data(row+1,col,level+1));
            }
            if(row-1  >= 0 && mat[row-1][col] == 1 && !visited[row-1][col]){
                res[row-1][col] = level;
                visited[row-1][col]=true;
                q.add(new Data(row-1,col,level+1));
            }
            if(col-1  >= 0 && mat[row][col-1] == 1 && !visited[row][col-1]){
                res[row][col-1] = level;
                visited[row][col-1]=true;
                q.add(new Data(row,col-1,level+1));
            }
            if(col+1  < n && mat[row][col+1] == 1 && !visited[row][col+1]){
                res[row][col+1] = level;
                visited[row][col+1]=true;
                q.add(new Data(row,col+1,level+1));
            }
        }
    }
}
class Data{
    int row,col,level;
    Data(int row, int col, int level){
        this.row = row;
        this.col = col;
        this.level = level;
    }
}


/// Further Optimized, similar GFG problem, https://www.geeksforgeeks.org/problems/distance-of-nearest-cell-having-1-1587115620/1
class Info{
    int row, col, dist;
    public Info(int row, int col, int dist){
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}
class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Info> q = new LinkedList<>();
        boolean visited[][] = new boolean[m][n];
        int res[][] = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    visited[i][j] = true;
                    q.add(new Info(i,j,0));
                }
            }
        }
        
        while(!q.isEmpty()){
            Info x = q.poll();
            int row = x.row;
            int col = x.col;
            int dist = x.dist;
            res[row][col] = dist;
            
            int[] delRow = {0,1,-1,0};
            int[] delCol = {1,0,0,-1};
            
            for(int i = 0; i<4; i++){
                int _row = row + delRow[i];
                int _col = col + delCol[i];
                
                if(_row >= 0 && _row < m && _col >=0 && _col <n && !visited[_row][_col]){
                    q.add(new Info(_row,_col,dist+1));
                    visited[_row][_col] = true;
                }
            }
        }
        return res;
    }
    
}
