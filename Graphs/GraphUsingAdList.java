package Graphs;

import java.util.*;

class GraphUsingAdList {
    private int V;                       // number of vertices
    private ArrayList<ArrayList<Integer>> adjList;

    // Constructor
    GraphUsingAdList(int V) {
        this.V = V;
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());  // initialize list for each vertex
        }
    }

    // Add edge (undirected graph)
    void addEdge(int u, int v) {
        adjList.get(u).add(v);  // u → v
        adjList.get(v).add(u);  // v → u
    }

    // Print adjacency list
    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " → ");
            for (int node : adjList.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
    int countEdges() {
        int count = 0;
        for (ArrayList<Integer> neighbors : adjList) {
            count += neighbors.size();
        }
        return count / 2; //for undirected
//        return count; // for directed
    }

    public static void main(String[] args) {
        GraphUsingAdList g = new GraphUsingAdList(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);

        System.out.println("Adjacency List (Undirected):");
        g.printGraph();
    }
}
