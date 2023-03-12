class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] visited = new int[m][n];
        Queue<data> q = new LinkedList<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    q.add(new data(i,j,0));
                    //visited[i][j] = 2;
                }        
            }
        }
        
        int maxtime = 0;
        int itr = 1;
        while(!q.isEmpty()){
            data d = q.poll();
            int row = d.row;
            int col = d.col;
            int time = d.time+1;
            
            System.out.println(d.row + " " + d.col + " " + d.time);
            // (row-1, col), (row+1,col), (row,col-1), (row,col+1)
            if(isvalid(row-1, col, m, n) && grid[row-1][col] == 1){
                q.add(new data(row-1, col, time));
                maxtime = time;
                //visited[row-1][col] = 2;
                grid[row-1][col] = 2;
            }
            if(isvalid(row+1, col, m, n) && grid[row+1][col] == 1){
                q.add(new data(row+1, col, time));
                maxtime = time;
                //visited[row+1][col] = 2;
                grid[row+1][col] = 2;
            }
            if(isvalid(row, col-1, m, n) && grid[row][col-1] == 1){
                q.add(new data(row, col-1, time));
                maxtime = time;
                //visited[row][col-1] = 2;
                grid[row][col-1] = 2;
            }
            if(isvalid(row, col+1, m, n) && grid[row][col+1] == 1){
                q.add(new data(row, col+1, time));
                maxtime = time;
                //visited[row][col+1] = 2;
                grid[row][col+1] = 2;
            }
            
        }
        //System.out.println("size = " + q.size());
        /*
        while(!q.isEmpty()){
            data d = q.poll();
            System.out.println(d.row + " " + d.col + " " + d.time);
        }*/
        boolean found = false;
        for(int i = 0; i <m; i++){
            for(int j = 0; j <n; j++){
                if(grid[i][j] == 1){
                    found = true;
                    break;
                }
            }
        }

        if(found){
            return -1;
        }
        return maxtime;
    }

    boolean isvalid(int row, int col, int m, int n){
        if(row >= m || col >= n)
            return false;
        if(row < 0 || col < 0)
            return false;
        
        return true;
    }
}

class data{
    int row;
    int col;
    int time;

    data(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
