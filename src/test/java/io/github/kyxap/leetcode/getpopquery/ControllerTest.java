package io.github.kyxap.leetcode.getpopquery;

import io.github.kyxap.leetcode.random.getpopquery.Controller;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ControllerTest {
    String QA = "QA";
    String QA_AUTOMATION = "QA Automation";
    String QA_MANUAL = "QA MANUAL";
    String QA_MANAGER = "QA MANAGER";
    String TRUCK_DRIVER = "TRUCK_DRIVER";
    String SINGER = "SINGER";
    final Controller controller = new Controller();

    @Test
    public void testCase1FirstQuery() {
        controller.get(1, QA);
        controller.get(1, SINGER);
        controller.get(1, QA_AUTOMATION);
        controller.get(2, QA_AUTOMATION);
        controller.get(2, TRUCK_DRIVER);
        controller.get(2, QA);
        controller.get(3, SINGER);
        controller.get(3, QA);
        assertEquals(Arrays.asList(SINGER, QA, QA_AUTOMATION), controller.get(4, SINGER));
    }

    @Test
    public void testCase2() {
        controller.get(1, QA);
        controller.get(1, SINGER);
        controller.get(2, QA);
        controller.get(2, SINGER);
        controller.get(3, SINGER);
        controller.get(3, QA);
        assertEquals(Arrays.asList(SINGER, QA), controller.get(4, SINGER));
    }

    @Test
    public void testCase3() {
        assertEquals(Arrays.asList(SINGER), controller.get(4, SINGER));
    }

    @Test
    public void testCase4() {
        controller.get(1, QA);
        controller.get(1, SINGER);
        controller.get(1, QA_AUTOMATION);
        controller.get(2, QA_AUTOMATION);
        controller.get(2, TRUCK_DRIVER);
        controller.get(2, QA);
        controller.get(3, SINGER);
        controller.get(3, QA);
        assertEquals(Arrays.asList(TRUCK_DRIVER, QA, QA_AUTOMATION), controller.get(4, TRUCK_DRIVER));
    }

    @Test
    public void test() {
    }
}
