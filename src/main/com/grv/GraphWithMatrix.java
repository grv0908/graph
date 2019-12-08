package main.com.grv;

import java.util.ArrayList;

/**
 * @author Gaurav Rajput
 * Created on 30/11/19
 *
 * Implementation of Graph using Adjacency Matrix
 *
 * Note : Vertices in Graph are starting from 1
 */
public class GraphWithMatrix {
    private int size;
    private int adj[][];

    // For Spanning Trees
    private ArrayList<Edge> edges;

    public GraphWithMatrix(int size) {
        this.size = size + 1;
        this.adj = new int[size + 1][size + 1];
        this.edges = new ArrayList<>();
    }

    public void addEdge(int u, int v) {
        this.adj[u][v] = 1;
        this.adj[v][u] = 1;
    }

    public void addDirectedEdge(int u, int v) {
        this.adj[u][v] = 1;
    }

    public void addDirectedEdge(int u, int v, int w) {
        this.adj[u][v] = w;
    }

    public void addEdge(int u, int v, int w) {
        this.adj[u][v] = w;
        this.adj[v][u] = w;
        this.edges.add(new Edge(u, v, w));
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Edge> getEdges() { return edges; }

    public int[][] getMatrix() {
        return adj;
    }
}
