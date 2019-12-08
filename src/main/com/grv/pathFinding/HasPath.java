package main.com.grv.pathFinding;

import main.com.grv.GraphWithList;

/**
 * @author Gaurav Rajput
 * Created on 30/11/19
 *
 * HasPath tell whether there exist a path between two vertices of Graph.
 */
public class HasPath {
    public static boolean hasPath(GraphWithList graph, int src, int dest) {
        boolean[] visited = new boolean[graph.getSize()];
        return hasPath(graph, src, dest, visited);
    }

    private static boolean hasPath(GraphWithList graph, int src, int dest, boolean[] visited) {
        if (src == dest)
            return true;

        visited[src] = true;

        for (int node : graph.getAdjacencyList(src)) {
            if (!visited[node]) {
               boolean ans = hasPath(graph, src, dest, visited);
               if (ans)
                   return true;
            }
        }
        return false;
    }
}
