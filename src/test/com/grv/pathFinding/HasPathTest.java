package test.com.grv.pathFinding;

import main.com.grv.GraphWithMatrix;
import main.com.grv.pathFinding.HasPath;
import org.junit.jupiter.api.Test;
import test.com.grv.GraphFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Gaurav Rajput
 * Created on 08/12/19
 */
class HasPathTest {
    @Test
    void test1() {
        GraphWithMatrix graph = GraphFactory.getGraphWithMatrixConnectedWithCycle();
    }
}