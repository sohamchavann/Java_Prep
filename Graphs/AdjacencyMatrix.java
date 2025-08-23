package Graphs;

import java.util.*;

class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of nodes and edges
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Create adjacency matrix (1-based indexing)
        int[][] adj = new int[n + 1][n + 1];

        // Read edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Undirected graph: mark both [u][v] and [v][u]
            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        // Print adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

