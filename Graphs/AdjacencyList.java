package Graphs;

import java.util.*;

class AdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of nodes and edges
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // Read edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Undirected graph: add both directions
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Print adjacency list
        System.out.println("Adjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            for (int v : adj.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
