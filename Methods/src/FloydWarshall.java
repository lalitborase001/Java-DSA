

    import java.util.Arrays;

    public class FloydWarshall {
        final static int INF = 99999; // A large value to represent infinity

        public static void floydWarshall(int graph[][], int V) {
            int dist[][] = new int[V][V];

            // Copy input graph to distance matrix
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    dist[i][j] = graph[i][j];
                }
            }

            // Apply Floyd-Warshall Algorithm
            for (int k = 0; k < V; k++) { // Intermediate vertex
                for (int i = 0; i < V; i++) { // Source vertex
                    for (int j = 0; j < V; j++) { // Destination vertex
                        // If vertex k is on the shortest path from i to j, update dist[i][j]
                        if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }

            // Print the final shortest distance matrix
            printSolution(dist, V);
        }

        public static void printSolution(int dist[][], int V) {
            System.out.println("Shortest distances between every pair of vertices:");
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][j] == INF) {
                        System.out.print("INF ");
                    } else {
                        System.out.print(dist[i][j] + "   ");
                    }
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int V = 4; // Number of vertices

            int graph[][] = {
                    {0, 8, INF, 1},
                    {INF, 0, 1, INF},
                    {4, INF, 0, INF},
                    {INF, 2, 9, 0}
            };

            // Run Floyd-Warshall Algorithm
            floydWarshall(graph, V);
        }
    }




