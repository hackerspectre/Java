// Graphs (Part I) ✅ 
import java.util.*;

public class JavaBasics {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 - Vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1 - Vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // 2 - Vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // 3 - Vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4 - Vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // 5 - Vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6 - Vertex
        graph[6].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge>[] graph, int src) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (Edge e : graph[curr]) {
                if (!visited[e.dest]) {
                    q.add(e.dest);
                    visited[e.dest] = true;
                }
            }
        }
    }

    // DFS (Depth First Search) using Stack ✅
    public static void dfs(ArrayList<Edge>[] graph, int src) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        s.push(src);
        visited[src] = true;

        while (!s.isEmpty()) {
            int curr = s.pop();
            System.out.print(curr + " ");

            for (Edge e : graph[curr]) {
                if (!visited[e.dest]) {
                    s.push(e.dest);
                    visited[e.dest] = true;
                }
            }
        }
    }

    // DFS (Depth First Search) using Recursion ✅ 
    public static void dfsRec(ArrayList<Edge>[] graph, int src, boolean[] visited) {
        visited[src] = true;
        System.out.print(src + " ");

        for (Edge e : graph[src]) {
            if (!visited[e.dest]) {
                dfsRec(graph, e.dest, visited);
            }
        }
    }

    // Has Path ✅
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited) {
        if (src == dest) {
            return true;
        }

        visited[src] = true;

        for (Edge e : graph[src]) {
            if (!visited[e.dest] && hasPath(graph, e.dest, dest, visited)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Adjacency List
        /*          (5)
                0 ------- 1
                         / \
                    (1) /   \  (3)
                       /     \
                      2 ----- 3
                      |  (1)
                  (2) |
                      |
                      4
        */

        /*
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];   // null -> empty list

        // Initializing the list for each vertex in the graph.
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 - Vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 - Vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 - Vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -Vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 - Vertex
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbours ✅
        for (Edge e : graph[2]) {
            System.out.println(e.src + " -> " + e.dest + " : " + e.wt);
        }
        */



        // BFS (Breadth First Search) ✅ 
        /*
                   1 ----- 3 
                  /        | \
                 /         |  \
                0          |   5 ----- 6
                 \         |  /
                  \        | /
                   2 ----- 4
        */

        /*
        int V = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];   // null -> empty list

        createGraph(graph);
        
        bfs(graph, 0);
        */


        // DFS (Depth First Search) ✅ 
        /*
                   1 ----- 3 
                  /        | \
                 /         |  \
                0          |   5 ----- 6
                 \         |  /
                  \        | /
                   2 ----- 4
        */

        int V = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];   // null -> empty list

        createGraph(graph);

        // dfs(graph, 0);

        boolean[] visited = new boolean[V];
        dfsRec(graph, 0, visited);



        // Qs. Has Path ✅ 
        // for given src or dest, tell if path exists from src to dest
        // src = 0 | dest = 5
        /*
                   1 ----- 3 
                  /        | \
                 /         |  \
                0          |   5 ----- 6
                 \         |  /
                  \        | /
                   2 ----- 4
        */

        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    }
}
