//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Pair{
    int row,col;
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        
        Pair p = (Pair)obj;
        return this.row == p.row && this.col == p.col;
    }
    
    @Override 
    public int hashCode(){
        return Objects.hash(this.row, this.col);
    }
}

class Solution {

    int countDistinctIslands(int[][] grid) {
        List<HashSet<Pair>> lst = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    var hs = bfs(i, j, grid, visited);
                    if(isDistinct(hs, lst)){
                        lst.add(hs);
                    }
                }
            }
        }
        return lst.size();
    }
    
    boolean isDistinct(HashSet<Pair> hs, List<HashSet<Pair>> lst){
        for(var set : lst){
            if(hs.equals(set)){
                return false;
            }
        }
        return true;
    }
    
    HashSet<Pair> bfs(int row, int col, int[][] grid, boolean[][] visited){
        HashSet<Pair> hs = new HashSet<>();
        
        Queue<Pair> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        visited[row][col] = true;
        //System.out.println("Inserting into hs for row = "+row+" col = "+col);
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            
            Pair p = q.poll();
            
            //System.out.println("Inserting elem to hs i = "+p.row+" j = "+p.col);
            hs.add(new Pair(p.row-row, p.col-col));
            
            int[] drow = {1,0,-1,0};
            int[] dcol = {0,1,0,-1};
            for(int i = 0; i<4; i++){
                int _row = p.row + drow[i];
                int _col = p.col + dcol[i];
                if(_row >=0 && _col >= 0 && _row < m && _col <n && grid[_row][_col] == 1 && !visited[_row][_col]){
                    q.add(new Pair(_row, _col));        
                    visited[_row][_col] = true;
                }
            }
        }
        return hs;
    }
}
