package DAA;

//import java.util.*;
//public class GraphColoring {
//
//    // A utility method to find the first available color for the vertex
//    public static int getColor(int vertex, boolean[] availableColors, List<List<Integer>>
//            graph) {
//        // Check the colors of adjacent vertices and mark them as unavailable
//        for (int neighbor : graph.get(vertex)) {
//            if (availableColors[neighbor]) {
//                availableColors[neighbor] = false; // Mark as unavailable
//            }
//        }
//
//        // Find the smallest color that can be used for the vertex
//        for (int color = 0; color < availableColors.length; color++) {
//            if (availableColors[color]) {
//                return color; // Return the first available color
//            }
//        }
//
//        return -1; // No color available
//    }
//    public static void greedyGraphColoring(List<List<Integer>> graph) {
//        int numVertices = graph.size();
//        int[] colors = new int[numVertices]; // Array to store the color of each vertex
//
//        // Initialize all vertices with -1 (meaning no color assigned yet)
//        Arrays.fill(colors, -1);
//
//        // A boolean array to keep track of available colors for each vertex
//        boolean[] availableColors = new boolean[numVertices];
//
//        // Assign the first color (color 0) to the first vertex
//        colors[0] = 0;
//
//        // Assign colors to remaining vertices
//        for (int u = 1; u < numVertices; u++) {
//            // Reset the available colors before checking neighbors
//            Arrays.fill(availableColors, true);
//
//            // Check all adjacent vertices and mark their colors as unavailable
//            for (int neighbor : graph.get(u)) {
//                if (colors[neighbor] != -1) {
//                    availableColors[colors[neighbor]] = false; // Mark as unavailable
//                }
//            }
//
//            // Assign the first available color to the vertex
//            colors[u] = getColor(u, availableColors, graph);
//        }
//
//        // Print the color assignments
//        System.out.println("Vertex Color Assignments:");
//        for (int i = 0; i < numVertices; i++) {
//            System.out.println("Vertex " + i + " -> Color " + colors[i]);
//        }
//    }
//    // Helper method to add an edge in the graph
//    public static void addEdge(List<List<Integer>> graph, int u, int v) {
//        graph.get(u).add(v);
//        graph.get(v).add(u); // For an undirected graph
//    }
//    public static void main(String[] args) {
//        // Number of vertices in the graph
//        int numVertices = 7;
//
//        // Create a graph with numVertices
//        List<List<Integer>> graph = new ArrayList<>();
//        for (int i = 0; i < numVertices; i++) {
//            graph.add(new ArrayList<>());
//        }
//
//        // Adding edges to the graph (example: a simple graph)
//        addEdge(graph, 0, 1);
//        addEdge(graph, 0, 2);
//        addEdge(graph, 1, 2);
//        addEdge(graph, 1, 3);
//        addEdge(graph, 2, 4);
//
//        // Call the greedy coloring algorithm
//        greedyGraphColoring(graph);
//    }
//}
import java.util.*;

public class GraphColoring {
    private int V; // Number of vertices
    private List<Integer>[] adjList;

    public GraphColoring(int vertices) {
        V = vertices;
        adjList = new ArrayList[V];
        for (int i = 0; i < V; i++)
            adjList[i] = new ArrayList<>();
    }

    // Add edge to the graph
    public void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u); // Undirected graph
    }

    // Greedy coloring function
    public void greedyColoring() {
        int[] result = new int[V];

        // Initialize all vertices as unassigned
        Arrays.fill(result, -1);

        // Assign the first color to the first vertex
        result[0] = 0;

        // A temporary array to store the available colors
        boolean[] available = new boolean[V];

        // Assign colors to remaining V-1 vertices
        for (int u = 1; u < V; u++) {
            // Process all adjacent vertices and mark their colors as unavailable
            Arrays.fill(available, true);
            for (int i : adjList[u]) {
                if (result[i] != -1)
                    available[result[i]] = false;
            }

            // Find the first available color
            int cr;
            for (cr = 0; cr < V; cr++) {
                if (available[cr])
                    break;
            }

            result[u] = cr; // Assign the found color
        }

        // Print the result
        for (int u = 0; u < V; u++)
            System.out.println("Vertex " + u + " ---> Color " + result[u]);
    }

    public static void main(String[] args) {
        GraphColoring g = new GraphColoring(6);
        g.addEdge(0, 1);
        g.addEdge(0, 5);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.greedyColoring();
    }
}
