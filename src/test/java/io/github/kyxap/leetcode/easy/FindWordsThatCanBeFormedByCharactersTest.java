package io.github.kyxap.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindWordsThatCanBeFormedByCharactersTest {
    @Test
    public void testCase() {
        String chars = "hello";
        String[] words = new String[]{"zz", "he", "lo"};
        assertEquals(4, FindWordsThatCanBeFormedByCharacters.countCharacters(words, chars));
    }
}
