// Graphs (Part II) ✅ 
// Connected Components
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

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));
        

        /*
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 0, 1));

        graph[0].add(new Edge(0, 2, 1));
        graph[2].add(new Edge(2, 0, 1));

        graph[1].add(new Edge(1, 3, 1));
        graph[3].add(new Edge(3, 1, 1));

        graph[2].add(new Edge(2, 4, 1));
        graph[4].add(new Edge(4, 2, 1));

        graph[2].add(new Edge(2, 6, 1));
        graph[6].add(new Edge(6, 2, 1));
        */
    }

    public static void dfs(ArrayList<Edge>[] graph, int src, boolean[] visited) {
        visited[src] = true;
        System.out.println(src);
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited);
            }
        }
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr);
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!visited[e.dest]) {
                    q.add(e.dest);
                    visited[e.dest] = true;
                }
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                bfs(graph);
            }
        }
    }

    // Cycle Detection
    public static boolean dfsCycle(ArrayList<Edge>[] graph, int src, boolean[] visited, int parent) {
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visited[e.dest]) {
                if (dfsCycle(graph, e.dest, visited, src)) {
                    return true;
                }
            } else if (e.dest != parent) {
                return true;
            }
        }
        return false;
    }

    // Bipartite Graph
    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] color = new int[graph.length];
        Arrays.fill(color, -1);
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                if (!bfsBipartite(graph, i, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean bfsBipartite(ArrayList<Edge>[] graph, int src, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        color[src] = 1;
        while (!q.isEmpty()) {
            int curr = q.remove();
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (color[e.dest] == -1) {
                    color[e.dest] = 1 - color[curr];
                    q.add(e.dest);
                } else if (color[e.dest] == color[curr]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Topological Sort
    public static void topoSort(ArrayList<Edge>[] graph) {
        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                topoSortUtil(graph, i, visited, s);
            }
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void topoSortUtil(ArrayList<Edge>[] graph, int src, boolean[] visited, Stack<Integer> s) {
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!visited[e.dest]) {
                topoSortUtil(graph, e.dest, visited, s);
            }
        }
        s.push(src);
    }

    public static void main(String[] args) {
        /*
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        dfsUtil(graph);
        bfsUtil(graph);
        */


        // Cycle Detection in Undirected Graph ✅
        // Cycle
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
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println("Cycle Detected: " + dfsCycle(graph, 0, new boolean[V], -1));
        */


        // No Cycle
        /*
           1 ----- 3
          /
         /
        0
         \
          \
           2 ----- 4
            \
             \
              6
        */

        /*
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println("Cycle Detected: " + dfsCycle(graph, 0, new boolean[V], -1)); 
        */
        
        

        // Bipartite Graph ✅
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
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println("Bipartite Graph: " + isBipartite(graph));
        */



        // Cycle Detection in Directed Graph ✅
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
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println("Cycle Detected: " + dfsCycle(graph, 0, new boolean[V], -1));
        */



        // Topological Sort ✅
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
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topoSort(graph);
        
    }
}
