class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean validRows = isValidRows(board);
        System.out.println("validRows " +validRows);
        if(!validRows){
            return false;
        }
        boolean validCols = isValidCols(board);
        System.out.println("validCols " +validCols);
        if(!validCols){
            return false;
        }
        boolean validSubBoxes = isValidSubBoxes(board);
        System.out.println("validSubBoxes " +validSubBoxes);
        if(!validSubBoxes){
            return false;
        }
        return true;
    }

    boolean isValidRows(char[][] board){
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    if(hs.contains(board[i][j])){
                        return false;
                    }
                    hs.add(board[i][j]);
                }
            }
            //System.out.println(hs);
            hs.clear();
        }
        return true;
    }

    boolean isValidCols(char[][] board){
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i < board[0].length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][i] != '.'){
                    if(hs.contains(board[j][i])){
                        return false;
                    }
                    hs.add(board[j][i]);
                }
            }
            hs.clear();
        }
        return true;
    }

    boolean isValidSubBoxes(char[][] board){
        HashSet<Character> hs = new HashSet<>();
        int[][] box = {{0,0},{0,3},{0,6},
                       {3,0},{3,3},{3,6},
                       {6,0},{6,3},{6,6}};
        
        for(int row = 0; row<box.length; row++){
            for(int i = box[row][0]; i<box[row][0]+3; i++){
                for(int j = box[row][1]; j<box[row][1]+3; j++){
                    if(board[i][j] != '.'){
                        if(hs.contains(board[i][j])){
                            return false;
                        }
                        hs.add(board[i][j]);
                    }
                }
            }
            hs.clear();
        }
        return true;
    }
}

// optimized
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];
        for(int i = 0; i<n; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                char val = board[r][c];
                if(val == '.'){
                    continue;
                }

                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);
                
                int idx = (r/3)*3 + c/3;
                if(boxes[idx].contains(val)){
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;
    }
}
