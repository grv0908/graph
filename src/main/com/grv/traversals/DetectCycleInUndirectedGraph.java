package main.com.grv.traversals;

import main.com.grv.GraphWithMatrix;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 */
public class DetectCycleInUndirectedGraph {
    public static boolean hasCycleUsingDFS(GraphWithMatrix graph) {
        boolean[] visited = new boolean[graph.getSize()];

        return dfs(graph, visited, 1, -1);
    }

    public static boolean dfs(GraphWithMatrix graph, boolean[] visited, int vertex, int parent) {
        visited[vertex] = true;

        for (int i = 1; i < graph.getSize(); i++) {
            if(graph.getMatrix()[vertex][i] != 0) {
                if(i != parent && visited[i]) {
                    return true;
                } else if(i != parent) {
                    dfs(graph, visited, i, vertex);
                }
            }
        }
        return false;
    }
}
