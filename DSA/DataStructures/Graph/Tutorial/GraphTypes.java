/*
Types of graph
1. Based on connectivity between edges
 (a) Un-Directed graph - In which a two nodes(u and v) are connected in both direction i.e u->v as well as well as v->u
     example : u-v
 (b) Directed graph - In which two nodes (u and v) are connected only in one direction i.e u->v OR v->u but not both
      example : u->v
2. Based on structure
 (a) Cyclic - If there exists an edge E from which we can start the traversal and reach back to the same edge during the course of traversal
       u-v-w
         | |
         k-t
       
 (a) ACyclic - If there doesn't exists an edge E from which we can start the traversal and reach back to the same edge during the course of traversal
        
        
path -  Constains lots of edges and each of the edges are reachable in the order mentioned in the path, a node cannot appear twice in a path

Degree -
    (a) undirected graph :
       D(Node) = total number of edges connected to node
       Total Degree of graph = 2 X E {E is the number of edges}
    
    (b) directed graph :
        1. Indegree of Node - the number of nodes going in a node
        2. Outdegree of Node - the number of outgoing edges for a node

Edge weight - the weight assigned to any Edge if no weight is assigned then we take weight as 1
     
    
*/
class Main{
    public static void main(String[] args){  
        
    }
}
