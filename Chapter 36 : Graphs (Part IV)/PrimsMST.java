import java.util.*;

public class PrimsMST {
    static class Edge {
        int src, dest, wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int cost;
        public Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 3, 1));
        // Removed self-loop: graph[3].add(new Edge(3, 3, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));
    }

    public static void primsMST(ArrayList<Edge>[] graph) {
        int V = graph.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[V];
        int[] parent = new int[V];
        int[] dist = new int[V];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        
        // Start from node 0
        pq.add(new Pair(0, 0));
        dist[0] = 0;

        ArrayList<String> mstEdges = new ArrayList<>();
        int mstCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (vis[curr.node]) continue;
            
            vis[curr.node] = true;
            mstCost += curr.cost;

            for (Edge e : graph[curr.node]) {
                if (!vis[e.dest] && e.wt < dist[e.dest]) {
                    parent[e.dest] = curr.node;
                    dist[e.dest] = e.wt;
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        // Print MST
        System.out.println("Minimum Spanning Tree Edges:");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + " (Weight: " + dist[i] + ")");
        }
        System.out.println("Total MST Cost: " + mstCost);
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        primsMST(graph);
    }
}
