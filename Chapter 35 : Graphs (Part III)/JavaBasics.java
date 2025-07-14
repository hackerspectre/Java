// Graphs (Part III) ✅ 
import java.util.*;

public class JavaBasics {
    /*
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Create Graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        
    }

    // Topological Sort using BFS (Kahns Algorithm) ✅ 
    public static int[] topologicalSort(ArrayList<Edge>[] graph, int V) {
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                indegree[e.dest]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int[] topo = new int[V];
        int idx = 0;
        while (q.size() > 0) {
            int curr = q.poll();
            topo[idx++] = curr;
            for (Edge e : graph[curr]) {
                if (--indegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        return topo;
    }

    // All Paths from source to target | Directed Graph ✅ 
    public static void allPaths(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, ArrayList<Integer> path, List<List<Integer>> result) {
    if (src == dest) {
        path.add(src);
        result.add(new ArrayList<>(path));
        path.remove(path.size() - 1);
        return;
    }

    visited[src] = true;
    path.add(src);

    for (Edge e : graph[src]) {
        if (!visited[e.dest]) {
            allPaths(graph, e.dest, dest, visited, path, result);
        }
    }

    path.remove(path.size() - 1);
    visited[src] = false;
    }

    public static List<List<Integer>> getAllPaths(ArrayList<Edge>[] graph, int src, int dest) {
        boolean[] visited = new boolean[graph.length];
        List<List<Integer>> result = new ArrayList<>();
        allPaths(graph, src, dest, visited, new ArrayList<>(), result);
        return result;
    }
    */

    // Dijkstra's Algorithm ✅ 
    static class Edge {
        int dest, weight;
        Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int vertex, dist;
        Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }

        public int compareTo(Node other) {
            return Integer.compare(this.dist, other.dist);
        }
    }

    static void dijkstra(List<List<Edge>> graph, int source) {
        int V = graph.size();
        int[] dist = new int[V];
        int[] prev = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);

        dist[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int u = current.vertex;

            for (Edge edge : graph.get(u)) {
                int v = edge.dest;
                int weight = edge.weight;
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    prev[v] = u;
                    pq.offer(new Node(v, dist[v]));
                }
            }
        }

        // Print shortest distances and paths
        System.out.println("Node\tDistance\tPath");
        for (int i = 0; i < V; i++) {
            System.out.print(i + "\t" + dist[i] + "\t\t");
            printPath(prev, i);
            System.out.println();
        }
    }

    static void printPath(int[] prev, int node) {
        if (node == -1) return;
        printPath(prev, prev[node]);
        System.out.print(node + " ");
    }
        public static void main(String[] args) {
        // Topological Sort using BFS (Kahns Algorithm) ✅ 
        // Time Complexity: O(V + E)
        // Space Complexity: O(V + E)

        /*
            5           4
            | \       / |
            |  \     /  |
            |     0     |
            |           |
            2-----3-----1
        */
        
        /*
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int[] ans = topologicalSort(graph, V);
        System.out.println("Topological Sort: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        */


        // All paths from source to target | Directed Graph ✅ 
        // S = 5, d = 1
        // Time Complexity: O(V + E)
        // Space Complexity: O(V + E)

        /*
            5           4
            | \       / |
            |  \     /  |
            |     0     |
            |           |
            2-----3-----1
        */
        
        /*
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        
        List<List<Integer>> paths = getAllPaths(graph, 5, 1);
        System.out.println("All Paths from 5 to 1:");
        for (List<Integer> path : paths) {
            for (int node : path) {
                System.out.print(node);
            }
            System.out.println();
        }
        */


        // Dijkstra's Algorithm ✅ 
        // Shortest path from source to all vertices (weighted graph)
        // Time Complexity: O(E log V)
        // Space Complexity: O(V + E)

        int V = 6;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Graph from image
        graph.get(0).add(new Edge(1, 2));
        graph.get(0).add(new Edge(2, 4));
        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(3, 7));
        graph.get(2).add(new Edge(4, 3));
        graph.get(4).add(new Edge(3, 2));
        graph.get(4).add(new Edge(5, 5));
        graph.get(3).add(new Edge(5, 1));

        dijkstra(graph, 0); // Starting from node 0
    }
}
