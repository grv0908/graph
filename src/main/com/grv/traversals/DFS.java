package main.com.grv.traversals;

import main.com.grv.GraphWithList;

/**
 * @author Gaurav Rajput
 * Created on 30/11/19
 */
public class DFS {
    public static void dfs(GraphWithList graph, int source) {
        boolean[] visited = new boolean[graph.getSize()];

        dfs(graph, source, visited);
    }

    public static void dfs(GraphWithList graph, int currVertex, boolean[] visited) {
        System.out.print(currVertex + " ");
        visited[currVertex] = true;

        for (int node : graph.getAdjacencyList(currVertex)) {
            if(!visited[node]) {
                dfs(graph, node, visited);
            }
        }
    }
}
