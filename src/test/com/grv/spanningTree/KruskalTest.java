package test.com.grv.spanningTree;

import main.com.grv.GraphWithMatrix;
import main.com.grv.spanningTree.Kruskal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.com.grv.GraphFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 */
class KruskalTest {
    @Test
    public void test1() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithCycle();
        Assertions.assertEquals(8, Kruskal.kruskal(graph));
    }

    @Test
    public void test2() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithoutCycle();
        Assertions.assertEquals(33, Kruskal.kruskal(graph));
    }

    @Test
    public void test3() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithFourCycle();
        Assertions.assertEquals(17, Kruskal.kruskal(graph));
    }
}