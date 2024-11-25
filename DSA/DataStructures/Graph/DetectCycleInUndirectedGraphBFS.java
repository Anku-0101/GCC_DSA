class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        HashSet<Integer> visited = new HashSet<>();

        // Check for cycles starting from each unvisited node
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                if (bfsCycleCheck(i, adj, visited)) {
                    return true;  // Cycle detected
                }
            }
        }
        return false;
    }
    
    private boolean bfsCycleCheck(int start, ArrayList<ArrayList<Integer>> adj, HashSet<Integer> visited) {
        Queue<int[]> queue = new LinkedList<>();  // Queue stores pairs (node, parent)
        queue.add(new int[]{start, -1});
        visited.add(start);

        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            int node = pair[0];
            int parent = pair[1];

            for (int neighbor : adj.get(node)) {
                if (!visited.contains(neighbor)) {
                    // Visit the neighbor and mark it as visited
                    visited.add(neighbor);
                    queue.add(new int[]{neighbor, node});
                } else if (neighbor != parent) {
                    // If we visit an already visited node that's not the parent, we found a cycle
                    return true;
                }
            }
        }
        return false;
    }
}
