package test.com.grv;

import main.com.grv.GraphWithMatrix;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 *
 * This class mainly used in testing.
 * Provides different types of Graphs
 */
public class GraphFactory {
    public static GraphWithMatrix getGraphWithMatrixConnectedWithCycle() {

        GraphWithMatrix graph = new GraphWithMatrix(6);
        graph.addEdge(1,3, 6);
        graph.addEdge(1,2, 1);
        graph.addEdge(2,4, 2);
        graph.addEdge(3,4, 1);
        graph.addEdge(3,5, 1);
        graph.addEdge(3,6, 3);
        graph.addEdge(5,6, 8);

        return graph;
    }

    public static GraphWithMatrix getGraphWithMatrixConnectedWithFourCycle() {

        GraphWithMatrix graph = new GraphWithMatrix(8);
        graph.addEdge(1, 3, 6);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 4, 2);
        graph.addEdge(3, 4, 1);
        graph.addEdge(3, 5, 1);
        graph.addEdge(3, 6, 3);
        graph.addEdge(5, 6, 8);
        graph.addEdge(4, 7, 8);
        graph.addEdge(6, 7, 2);
        graph.addEdge(1, 8, 9);
        graph.addEdge(5, 8, 7);

        return graph;
    }

    public static GraphWithMatrix getGraphWithMatrixConnectedWithoutCycle() {
        GraphWithMatrix graph = new GraphWithMatrix(6);
        graph.addEdge(1,3, 5);
        graph.addEdge(1,2, 10);
        graph.addEdge(2,4, 3);
        graph.addEdge(3,5, 9);
        graph.addEdge(5,6, 6);

        return graph;
    }

    public static GraphWithMatrix getGraphWithMatrixDisconnected() {
        GraphWithMatrix graph = new GraphWithMatrix(6);
        graph.addEdge(1,4, 6);
        graph.addEdge(1,2, 1);
        graph.addEdge(2,4, 2);
        graph.addEdge(3,5, 1);
        graph.addEdge(3,6, 3);
        graph.addEdge(5,6, 8);

        return graph;
    }

    public static GraphWithMatrix getGraphWithMatrixThreeDisconnected() {
        GraphWithMatrix graph = new GraphWithMatrix(9);
        graph.addEdge(1,4, 6);
        graph.addEdge(1,2, 1);
        graph.addEdge(2,4, 2);
        graph.addEdge(3,5, 1);
        graph.addEdge(3,6, 3);
        graph.addEdge(5,6, 8);
        graph.addEdge(7,8, 5);
        graph.addEdge(8,9, 3);
        graph.addEdge(9,7, 8);

        return graph;
    }

    public static GraphWithMatrix getDirectedGraphWithNoCycle() {
        GraphWithMatrix graph = new GraphWithMatrix(9);
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(2, 5);
        graph.addDirectedEdge(2, 8);
        graph.addDirectedEdge(8, 9);
        graph.addDirectedEdge(3, 4);
        graph.addDirectedEdge(4, 5);
        graph.addDirectedEdge(5, 9);
        graph.addDirectedEdge(7, 6);
        graph.addDirectedEdge(6, 8);

        return graph;
    }

    public static GraphWithMatrix getDirectedGraphWithCycle() {
        GraphWithMatrix graph = new GraphWithMatrix(9);
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(2, 5);
        graph.addDirectedEdge(2, 8);
        graph.addDirectedEdge(8, 9);
        graph.addDirectedEdge(3, 4);
        graph.addDirectedEdge(4, 5);
        graph.addDirectedEdge(5, 7);
        graph.addDirectedEdge(7, 1);

        return graph;
    }

    public static GraphWithMatrix getDisconnectedDirectedGraphWithCycle() {
        GraphWithMatrix graph = new GraphWithMatrix(9);
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(2, 5);
        graph.addDirectedEdge(2, 8);
        graph.addDirectedEdge(8, 9);
        graph.addDirectedEdge(3, 4);
        graph.addDirectedEdge(4, 5);
        graph.addDirectedEdge(5, 9);
        graph.addDirectedEdge(6, 7);
        graph.addDirectedEdge(7, 6);

        return graph;
    }

    public static GraphWithMatrix getDisconnectedDirectedGraphWithNoCycle() {
        GraphWithMatrix graph = new GraphWithMatrix(10);
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(2, 5);
        graph.addDirectedEdge(2, 8);
        graph.addDirectedEdge(8, 9);
        graph.addDirectedEdge(3, 4);
        graph.addDirectedEdge(4, 5);
        graph.addDirectedEdge(5, 9);
        graph.addDirectedEdge(6, 7);
        graph.addDirectedEdge(7, 10);
        graph.addDirectedEdge(6, 10);

        return graph;
    }
}
