package main.com.grv.pathFinding;

import main.com.grv.GraphWithMatrix;

/**
 * @author Gaurav Rajput
 * Created on 30/11/19
 *
 * Dijkstra's Algorithm solves the single source shortest path problem in O((E + V)logV) time
 * The sssp is to find the shortest distance from the source vertex to all other vertices in the graph.
 */
public class Dijkstra {
    public static int[] dijkstra(GraphWithMatrix graph, int src) {
        int[] distance = new int[graph.getSize()];
        boolean[] visited = new boolean[graph.getSize()];

        for (int i = 1; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[src] = 0;

        for (int i = 1; i < graph.getSize(); i++) {
            int minVertex = getMinVertex(distance, visited);
            visited[minVertex] = true;
            for (int j = 1; j < graph.getSize(); j++) {
                if (graph.getMatrix()[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {
                    int newDistance = distance[minVertex] + graph.getMatrix()[minVertex][j];
                    distance[j] = Math.min(newDistance, distance[j]);
                }
            }
        }

        System.out.println("Distance Array is : ");
        for (int i = 0; i < distance.length; i++) {
            System.out.println("Distance from " + src + " to " + i + " is : " + distance[i]);
        }

        return distance;
    }

    public static int getMinVertex(int[] distance, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i <  distance.length; i++) {
            if(!visited[i] && (minVertex == -1 || distance[minVertex] > distance[i])) {
                minVertex = i;
            }
        }
        return minVertex;
    }
}

