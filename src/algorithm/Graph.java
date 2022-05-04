package algorithm;

public class Graph {
    private static final int MAX_VERTICES = 20; 	// allow only 20 vertices
    protected char[] vertex; 			// list of vertices
    protected int[][] adjMatrix; 		// adjacency matrix
    protected int numVertices;  			//number of vertices
    protected int numEdges;

    //default constructor
    public Graph(){
        //create vertex objects
        vertex = new char[MAX_VERTICES];
        //create adjacency matrix objects
        adjMatrix = new int[MAX_VERTICES][MAX_VERTICES];
        numVertices = 0;
        numEdges = 0;

        //set all elements of adjacency matrix to be zero (no edges)
        for(int i=0; i< MAX_VERTICES; i++) {
            for(int j=0; j< MAX_VERTICES; j++) {
                adjMatrix[i][j] = 0;
            }
        }
    }

    //add new vertex with title
    public void addVertex(char title) {
        vertex[numVertices++] = title;
    }

    //add edge between two vertices
    public void addEdge(int start, int end) {
        // set value in adjacency matrix
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
        numEdges++;
    }

    //graph's size
    public void showSize(){
        System.out.println("Size of graph = " + numVertices);
        System.out.println();
    }

    // display each vertex's title
    public void showVertex() {
        System.out.println("=== Vertexes ===");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(vertex[i] + " ");
        }
        System.out.println("\n");
    }

    //display adjacency matrix
    public void showAdjacency() {
        System.out.println("=== Adjacency Matrix ===");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //display all edges
    public void showEdge() {
        System.out.println("=== Edges ===");
        System.out.println("Number of edge = " + numEdges);
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j] == 1){
                    System.out.print(vertex[i] + "-" + vertex[j] + " ");
                }
            }
        }
        System.out.println("\n");
    }

    //check if the graph complete?
    public void checkComplete() {
        int complete = vertex.length * (vertex.length-1) / 2;
        System.out.println("This graph is " + (numVertices == complete ? "" : "NOT") + " a complete graph");
    }

}

