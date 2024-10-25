class Solution {
    
    public int findCircleNum(int[][] isConnected) {
        int[] visited = new int[isConnected.length];
        int ans = 0;
        for(int i = 0; i < visited.length; i++){
            if(visited[i] == 0){
                bfs(isConnected, visited, i);
                ans++;
            }
        }
        return ans;
    }

    void bfs(int[][] isConnected,int[] visited, int start){
        visited[start] = 1;

        for(int i = 0 ; i < isConnected[start].length; i++){
            if(visited[i] == 0 && isConnected[start][i] == 1){
                bfs(isConnected, visited, i);
            }
        }
    }
}
