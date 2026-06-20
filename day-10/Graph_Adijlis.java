public class Graph_Adijlis {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public Graph_Adijlis(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
    }

    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
    }

    public boolean hasEdge(int source, int destination) {
        return adjacencyMatrix[source][destination] == 1;
    }

    public static void main(String[] args) {
        Graph_Adijlis graph = new Graph_Adijlis(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Graph adjacency matrix:");
        for (int i = 0; i < graph.numVertices; i++) {
            for (int j = 0; j < graph.numVertices; j++) {
                System.out.print(graph.adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Does edge exist between 0 and 1? " + graph.hasEdge(0, 1));
        System.out.println("Does edge exist between 1 and 3? " + graph.hasEdge(1, 3));

        graph.removeEdge(2, 3);
        System.out.println("Does edge exist between 2 and 3 after removal? " + graph.hasEdge(2, 3));
    }
}
