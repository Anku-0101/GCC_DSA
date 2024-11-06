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
