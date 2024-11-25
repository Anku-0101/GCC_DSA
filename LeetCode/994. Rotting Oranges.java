class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<Pair>();

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j,0));
                }
            }
        }
        int ans = bfs(grid, q);

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return ans;
    }

    int bfs(int[][] grid, Queue<Pair> q){
        int time = 0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int r = p.x, c = p.y;
            time = p.t;

            System.out.println("r = "+r+" c = "+ c+" t = "+ time);
            if(r+1 < grid.length  && grid[r+1][c] == 1){
                q.add(new Pair(r+1, c, time+1));
                grid[r+1][c]=2;
            }
            if(r-1 >= 0 && grid[r-1][c] == 1){
                q.add(new Pair(r-1, c, time+1));
                grid[r-1][c] = 2;
            }
            if(c-1 >= 0 && grid[r][c-1] == 1){
                q.add(new Pair(r, c-1, time+1));
                grid[r][c-1] = 2;
            }
            if(c+1 < grid[0].length && grid[r][c+1] == 1){
                q.add(new Pair(r, c+1, time+1));
                grid[r][c+1] = 2;
            }
        }
        return time;
    }

}
class Pair{
    int x,y,t;
    public Pair(int row, int col, int time){
        x = row; y = col; t = time;
    }
}
