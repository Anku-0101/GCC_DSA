import java.util.*;

public class Main {
    public static void main(String[] args) {
        Graph gh = new Graph();
        /*
        1-3
        |
        5-2
        |
        4


     */
        //var matrix = gh.adjacencyMatrix(5,4);
        //printMatrix(matrix);
        //var adjList = gh.adjacencyList(5,4);
        //printAdjList(adjList);
        //printList(gh.bfsOfGraph(5,adjList));
        //System.out.println();
        //printList(gh.dfsOfGraph(5,adjList));

        //[[1,1,1],[1,1,0],[1,0,1]]
        int[][] matrix = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        //gh.numberOfProvince(matrix);
        //gh.floodFill(matrix,1,1,2);
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        al.add(new ArrayList<Integer>(Arrays.asList(0,1)));
        var res = gh.isCycle(al);
        System.out.println(res);
    }

    public static void printList(ArrayList<Integer> adjList){
        for (var ele : adjList)
            System.out.print(ele);
    }

    public static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val);
            }
            System.out.println();
        }
    }

    public static void printAdjList(ArrayList<ArrayList<Integer>> arrayList){
        for(int i = 0; i < arrayList.size(); i++){
            System.out.print("Vertex " + i + " = ");
            for(int j = 0; j < arrayList.get(i).size(); j++){
                System.out.print(arrayList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

class Graph{

    public int[][] adjacencyMatrix(int n, int m){
        int[][] arr = new int[n+1][n+1];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < m; i++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            arr[node1][node2] = 1;
            arr[node2][node1] = 1;
        }
        return arr;
    }

    public ArrayList<ArrayList<Integer>>  adjacencyList(int n, int m){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i <= n; i++){
            adjList.add(new ArrayList<>());
        }

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < m; i++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            adjList.get(node1).add(node2);
            adjList.get(node2).add(node1);
        }

        return adjList;
    }

    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        visited[1] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(var element : adj.get(node)){
                if(!visited[element]){
                    visited[element] = true;
                    q.add(element);
                }
            }
        }

        return bfs;
    }

    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[v+1];
        visited[1] = true;
        dfs(1, visited, adj, dfs);
        return dfs;
    }

    public void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res){
        res.add(node);
        visited[node] = true;

        for(Integer it : adj.get(node)){
            if(!visited[it]){
                visited[it] = true;
                dfs(it,visited,adj,res);
            }
        }
    }

    public void numberOfProvince(int[][] isConnected){
        int v = isConnected.length;
        boolean[] visited = new boolean[v];
        int res  = 0;

        for(int i = 0; i<v; i++){
            if(visited[i] == false) {
                res++;
                Mdfs(i, visited, isConnected);
            }
        }
    }

    void Mdfs(int node, boolean[] visited, int[][] isConnected) {
        visited[node] = true;
        for (int i = 0; i < isConnected[node].length; i++) {
            if (isConnected[node][i] == 1 && visited[node] == false) {
                Mdfs(i, visited, isConnected);
            }
        }
    }

    // [[1,1,1],
    // [1,1,0],
    // [1,0,1]]
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int col = image[sr][sc];
        image[sr][sc] = color;
        if(sr+1 <  m && image[sr+1][sc] == col) floodFill(image, sr+1, sc, color);
        if(sr-1 >= 0 && image[sr-1][sc] == col) floodFill(image, sr-1, sc, color);
        if(sc-1 >= 0 && image[sr][sc-1] == col) floodFill(image, sr, sc-1, color);
        if(sc+1 < n && image[sr][sc+1] == col) floodFill(image, sr, sc+1, color);

        return image;
    }
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        HashSet<Integer> hs = new HashSet<>();
        Queue<Integer> q = new LinkedList<Integer>();


        for(int i = 0; i<adj.size(); i++){
            for(int j = 0; j < adj.get(i).size(); j++){
                q.add(adj.get(i).get(j));
                while(!q.isEmpty()){
                    int node = q.poll();
                    if(!hs.contains(node)){
                        //visited[node] = true;
                        for(int k = 0; k < adj.get(node).size(); k++){
                            //System.out.println("k = "+ k.toString() + "node = " + node.toString() + " adj(node) = "+ adj(node));
                            if(hs.contains(adj.get(node).get(k))){
                                //System.out.println(adj.get(node).get(k));
                                //System.out.println("node = "+node);
                                return true;

                            }
                            //
                            q.add(adj.get(node).get(k));
                        }
                        hs.add(node);
                    }
                }
            }
        }
        return false;
    }

}