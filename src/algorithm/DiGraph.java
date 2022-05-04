package algorithm;

public class DiGraph extends Graph {

    @Override
    public void addEdge(int start, int end) {/* Do nothing*/}

    public void addEdge(int start, int end, int weight){
        adjMatrix[start][end] = weight;
        numEdges++;
    }

    @Override
    public void showEdge() {
        System.out.println("=== Edges ===");
        System.out.println("Number of edge = " + numEdges);
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                int weight = adjMatrix[i][j];
                if (weight > 0){
                    System.out.print(vertex[i] + "-" + vertex[j] + "(" + weight + ") ");
                }
            }
        }
        System.out.println("\n");
    }

    //compute path length
    public int findPathLength(int[] path) {
        int length = 0;
        for (int i = 0; i < path.length - 1; i++){
            // add the weight of the edge to the length which is 0 or more
            length += adjMatrix[path[i]][path[i+1]];
        }
        return length;
    }
}

