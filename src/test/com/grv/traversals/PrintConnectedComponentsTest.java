package test.com.grv.traversals;

import main.com.grv.GraphWithMatrix;
import main.com.grv.traversals.PrintConnectedComponents;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.com.grv.GraphFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 */
class PrintConnectedComponentsTest {
    @Test
    public void test1() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithCycle();
        Assertions.assertEquals(1, PrintConnectedComponents.printConnectedComponents(graph));
    }

    @Test
    public void test2() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixDisconnected();
        Assertions.assertEquals(2, PrintConnectedComponents.printConnectedComponents(graph));
    }

    @Test
    public void test3() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithFourCycle();
        Assertions.assertEquals(1, PrintConnectedComponents.printConnectedComponents(graph));
    }

    @Test
    public void test4() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixThreeDisconnected();
        Assertions.assertEquals(3, PrintConnectedComponents.printConnectedComponents(graph));
    }
}