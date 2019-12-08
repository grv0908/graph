package main.com.grv.spanningTree;

import main.com.grv.GraphWithMatrix;

/**
 * @author Gaurav Rajput
 * Created on 30/11/19
 *
 * Prim’s Algorithm also use Greedy approach to find the minimum spanning tree.
 * In Prim’s Algorithm we grow the spanning tree from a starting position.
 * Unlike an edge in Kruskal's, we add vertex to the growing spanning tree in Prim's.
 *
 */
public class Prims {
    public static int prims(GraphWithMatrix graph, int src) {
        boolean[] visited = new boolean[graph.getSize()];
        int[] cost = new int[graph.getSize()];
        int[] parent = new int[graph.getSize()];

        for (int i = 1; i < cost.length; i++) {
            cost[i] = Integer.MAX_VALUE;
        }

        cost[src] = 0;
        parent[src] = -1;

        for (int i = 0; i < graph.getSize() - 1; i++) {
            int minVertex = getMinVertex(cost, visited);
            visited[minVertex] = true;

            for (int j = 1; j < graph.getSize(); j++) {
                if (!visited[j] && graph.getMatrix()[minVertex][j] != 0) {
                    if (graph.getMatrix()[minVertex][j] < cost[j]) {
                        parent[j] = minVertex;
                        cost[j] = Math.min(graph.getMatrix()[minVertex][j], cost[j]);
                    }
                }
            }
        }

        int minCost = 0;
        for (int i = 1; i < parent.length; i++) {
            minCost += cost[i];
            System.out.println("Adding edge " + i +" <---> " + parent[i] + " in MST");
        }
        System.out.println("Total Cost to Build Min Spanning tree is : " + minCost);

        return minCost;
    }

    public static int getMinVertex(int[] cost, boolean[] visited) {
        int minIndex = -1;
        for (int i = 1; i < cost.length; i++) {
            if (!visited[i] &&  (minIndex == -1 || cost[minIndex] > cost[i])) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
