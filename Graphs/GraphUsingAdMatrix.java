package Graphs;
class GraphUsingAdMatrix {
    private int V;              // number of vertices
    private int[][] adjMatrix;  // adjacency matrix

    // Constructor
    GraphUsingAdMatrix(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
    }

    // Add edge (undirected graph)
    void addEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
        // Undirected graph: mark both [u][v] and [v][u]
        //if directed mark only u and v;
    }

    // Print adjacency matrix
    void printGraph() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphUsingAdMatrix g = new GraphUsingAdMatrix(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);

        System.out.println("Adjacency Matrix:");
        g.printGraph();
    }
}
