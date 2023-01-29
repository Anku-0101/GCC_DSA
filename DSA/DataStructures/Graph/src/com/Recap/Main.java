package com.Recap;
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        ArrayList<ArrayList<Integer>> adj = ConstructGraph(8,8);
        System.out.println(adj);
        //PrintBFS(adj);
        PrintDFS(adj,1);
    }

    /**
     * Constructs graph
     * @param n = number of edges
     * @param m = number of vertices
     * @return
     */
    public static ArrayList<ArrayList<Integer>> ConstructGraph(int n, int m){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i <=n; i++)
            graph.add(new ArrayList<Integer>());


        while (m-- > 0){
            int v1, v2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter vertex 1");
            v1 = sc.nextInt();
            System.out.println("Enter vertex 2");
            v2 = sc.nextInt();

            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        return graph;
    }

    /*
    BFS
    Here starting node is taken as 1,
    BFS depends on starting node
    Space Complexity = O(3N) ~ O(N)
    Time Complexity = O(N) + O(2E)
    */
    public static void PrintBFS(ArrayList<ArrayList<Integer>> adj){
        int[] visited = new int[adj.size()];
        Queue<Integer> bfs = new ArrayDeque<>();

        for(int i = 1; i < visited.length; i++){
            if(visited[i] == 0){
                bfs.add(i);
                visited[i] = 1;
            }
            while (!bfs.isEmpty()){
                int element = bfs.peek();
                System.out.printf(bfs.poll() + " ");

                for(Integer node : adj.get(element)) {
                    if(visited[node] == 0) {
                        bfs.add(node);
                        visited[node] = 1;
                    }
                }
            }
        }
    }

    /*
    Method to print DFS of graph, given the start Node
    */
    public static void PrintDFS(ArrayList<ArrayList<Integer>> adj, int startNode){
        int[] visited = new int[adj.size()];
        PrintDFSHelper(adj, visited, startNode);
    }

    private static void PrintDFSHelper(ArrayList<ArrayList<Integer>> adj, int[] visited, int startNode) {
        System.out.println(startNode);
        visited[startNode] = 1;

        for(int j = 0; j < adj.get(startNode).size(); j++){
            if(visited[adj.get(startNode).get(j)] == 0){
                PrintDFSHelper(adj, visited, adj.get(startNode).get(j));
            }
        }
    }

    /*
    547. Number of Provinces
    Leetcode problem
    */
    static int findCircleNum(int[][] isConnected) {
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

    static void bfs(int[][] isConnected,int[] visited, int start){
        visited[start] = 1;

        for(int i = 0 ; i < isConnected[start].length; i++){
            if(visited[i] == 0 && isConnected[start][i] == 1){
                bfs(isConnected, visited, i);
            }
        }
    }
}
