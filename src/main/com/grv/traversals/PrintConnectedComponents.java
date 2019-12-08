package main.com.grv.traversals;

import main.com.grv.GraphWithList;
import main.com.grv.GraphWithMatrix;

/**
 * @author Gaurav Rajput
 * Created on 30/11/19
 *
 * Print all connected components of a graph
 * returns no of connected component.
 */
public class PrintConnectedComponents {
    public static int printConnectedComponents (GraphWithMatrix graph) {
        int connectedComponents = 0;
        boolean[] visited = new boolean[graph.getSize()];
        for (int i = 1; i < graph.getSize(); i++) {
            if (!visited[i]) {
                dfs(graph, i, visited);
                connectedComponents++;
                System.out.println();
            }
        }
        return connectedComponents;
    }

    public static void dfs (GraphWithMatrix graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 1; i < graph.getSize(); i++) {
            if (!visited[i] && graph.getMatrix()[vertex][i] != 0) {
                dfs(graph, i, visited);
            }
        }
    }
}
