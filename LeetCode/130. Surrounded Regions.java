class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'O' && (i == 0 || j == 0 || i == m-1 || j == n-1)){
                   dfs(i,j,board);
                }
            }
        }

        for(int i = 0; i<m; i++){
            for(int j = 0; j <n; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '*'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    void dfs(int row, int col, char[][] board){
        int m = board.length;
        int n = board[0].length;
        board[row][col] = '*';
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        for(int i = 0; i < 4; i++){
            int _row = row + drow[i];
            int _col = col + dcol[i];
            if(_row >= 0 && _col >= 0 && _row <m && _col <n && board[_row][_col] == 'O'){
                dfs(_row, _col, board);
            }
        }
        
    }
}
