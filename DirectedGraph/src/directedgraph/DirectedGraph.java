/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package directedgraph;
public class DirectedGraph {
 private int[][] adjacencyMatrix;
    private int numVertices;
    // Constructor to initialize the graph with a given number of vertices
    public DirectedGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }
    // Method to add a directed edge from source to destination
    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
    }
    // Method to check if there is an edge from source to destination
    public boolean hasEdge(int source, int destination) {
        return adjacencyMatrix[source][destination] == 1;
    }
    public void removeEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 0;
    }
    // Method to print the adjacency matrix representation of the graph
    public void printGraph() {
        System.out.println("Adjacency Matrix representation of the graph:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(5);
        // Adding directed edges
        graph.addEdge(0, 1);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Printing the graph
        graph.printGraph();
    }

}
