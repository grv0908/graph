package main.com.grv.traversals;

import main.com.grv.GraphWithList;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Gaurav Rajput
 * Created on 30/11/19
 */
public class BFS {
    public static void bfs(GraphWithList graph, int source) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.getSize()];

        queue.add(source);
        visited[source] = true;
        while(!queue.isEmpty()) {
            int currNode = queue.remove();
            System.out.print(currNode + " ");

            for (int node : graph.getAdjacencyList(currNode)) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                }
            }
        }
    }
}
