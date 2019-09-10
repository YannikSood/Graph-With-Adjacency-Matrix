import java.util.LinkedList;

/**
 * Graph is a data structure that consists of following two components:
 * 1. A finite set of vertices also called as nodes.
 * 2. A finite set of ordered pair of the form (u, v) called an edge. 
 * The pair is ordered because (u, v) is not same as (v, u) in case of a directed graph(di-graph). 
 * The pair of the form (u, v) indicates that there is an edge from vertex u to vertex v. 
 * The edges may contain weight/value/cost.
 * 
 * Graphs are used to represent many real-life applications: Graphs are used to represent networks. 
 * The networks may include paths in a city or telephone network or circuit network. 
 * Graphs are also used in social networks like linkedIn, Facebook. 
 * For example, in Facebook, each person is represented with a vertex(or node). 
 * Each node is a structure and contains information like person id, name, gender and locale.
 * 
 * Adjacency Matrix:
 * Adjacency Matrix is a 2D array of size V x V where V is the number of vertices in a graph. 
 * Let the 2D array be adj[][], a slot adj[i][j] = 1 indicates that there is an edge from vertex i to vertex j. 
 * Adjacency matrix for undirected graph is always symmetric. 
 * Adjacency Matrix is also used to represent weighted graphs. 
 * If adj[i][j] = w, then there is an edge from vertex i to vertex j with weight w.
 * 
 * @author yanniksood
 *
 */
public class GraphAdjacencyList {
    
   private int size;
   private LinkedList<Integer> adjMatrix[];
   
   /**
    * Create a new GraphAdjacencyList of size x
    * @param x How many vertices
    */
   public GraphAdjacencyList(int x) {
       this.size = x;
       adjMatrix = new LinkedList[size];
       
       //Create a new linked list for each vertice
       for (int i = 0; i < size; i++) {
           adjMatrix[i] = new LinkedList<>();
       }
       
   }
    
   /**
    * Add an edge to the graph
    * @param src new vertice
    * @param dest vertice to add to
    */
   public void addEdge(int src, int dest) {
       this.adjMatrix[src].add(dest);
       this.adjMatrix[dest].add(src);
   }
   
   /**
    * Print the graph
    */
   public void printGraph() {
       for (int i = 0; i < size; i++) {
           System.out.println("Adjacency list of vertex "+ i); 
           System.out.print("head"); 
           
           for(Integer pCrawl: this.adjMatrix[i]){ 
               System.out.print(" -> "+pCrawl); 
           } 
           System.out.println("\n");
       }
   }
   
   // Driver program to test above functions 
   public static void main(String args[]) 
   { 
       
       int V = 5; 
       GraphAdjacencyList graph = new GraphAdjacencyList(V); 
       graph.addEdge(0, 1); 
       graph.addEdge(0, 4); 
       graph.addEdge(1, 2); 
       graph.addEdge(1, 3); 
       graph.addEdge(1, 4); 
       graph.addEdge(2, 3); 
       graph.addEdge(3, 4); 
      
       // print the adjacency list representation of  
       // the above graph 
       graph.printGraph(); 
   } 
} 
   

