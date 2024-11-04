public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        HashSet<Integer> visited = new HashSet<>();
        int n = adj.size();
        
        for(int i = 0; i<n; i++){
            if(!visited.contains(i)){
                if(isCycleDfs(i,-1,adj,visited)){
                    return true;
                }    
            }
        }
        return false;
    }
    boolean isCycleDfs(int start,int parent, ArrayList<ArrayList<Integer>> adj, HashSet<Integer> visited){
        visited.add(start);
        
        for(int node : adj.get(start)){
            if(!visited.contains(node)){
                visited.add(node);
                return isCycleDfs(node,start,adj,visited);
            }
            if(node != parent){
                return true;
            }
        }
        return false;
    }
