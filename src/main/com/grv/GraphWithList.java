package main.com.grv;

import java.util.LinkedList;

/**
 * @author Gaurav Rajput
 * Created on 30/11/19
 *
 * Implementation of Graph using adjacency List
 *
 * Note : Vertices in Graph are starting from 1
 */
public class GraphWithList {
    private int size;
    private LinkedList<Integer> adj[];

    public GraphWithList(int size) {
        this.size = size + 1;
        this.adj = new LinkedList[size + 1];

        for (int i = 0; i < this.adj.length; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        this.adj[u].add(v);
        this.adj[v].add(u);
    }

    public int getSize() {
        return size;
    }

    public LinkedList<Integer> getAdjacencyList(int node) {
        return adj[node];
    }
}
