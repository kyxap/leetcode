package io.github.kyxap.leetcode.easy;

import org.junit.Test;

import static io.github.kyxap.leetcode.easy.PerfectNumber.checkPerfectNumber;
import static junit.framework.TestCase.assertTrue;

public class PerfectNumberTest {
    @Test
    public void test1() {
        assertTrue(checkPerfectNumber(28));
    }
}
