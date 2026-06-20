import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public class Graph {
    private int[][] adjmat;
    int vertex;

    Graph(int vertex) {
        this.vertex = vertex;
        adjmat = new int[vertex + 1][vertex + 1];
    }

    // Add an edge to the graph
    public void addEdge(int i, int j) {
        adjmat[i][j] = 1;
        adjmat[j][i] = 1;
    }

    // Check if an edge exists in the graph
    public boolean hasEdge(int i, int j) {
        return adjmat[i][j] == 1;
    }

    // Delete an edge from the graph
    public void deleteEdge(int i, int j) {
        adjmat[i][j] = 0;
        adjmat[j][i] = 0;
    }

    // Degree of a vertex
    public int degreeOfVertex(int v) {
        int degree = 0;
        for (int i = 0; i < adjmat.length; i++) {
            if (adjmat[v][i] == 1) {
                degree++;
            }
        }
        return degree;
    }

    // Find the neighbors of a vertex
    public void findNeighbors(int v) {
        System.out.print("Neighbors of vertex " + v + ": ");
        for (int i = 0; i < adjmat.length; i++) {
            if (adjmat[v][i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Print the adjacency matrix of the graph
    public void printGraph() {
        for (int i = 0; i < adjmat.length; i++) {
            for (int j = 0; j < adjmat[i].length; j++) {
                System.out.print(adjmat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Perform BFS traversal of the graph
    public void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        q.add(start);
        set.add(start);

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.println(curr);

            for (int i = 0; i < adjmat.length; i++) {
                if (adjmat[curr][i] == 1 && !set.contains(i)) {
                    q.add(i);
                    set.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.printGraph();
        System.out.println("________________________");
        g.bfs(1);
    }
}