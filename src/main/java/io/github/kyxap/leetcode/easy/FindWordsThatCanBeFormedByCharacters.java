package io.github.kyxap.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1160. Find Words That Can Be Formed by Characters
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class FindWordsThatCanBeFormedByCharacters {

    /**
     * Runtime: 110 ms, faster than 5.13% of Java online submissions for Find Words That Can Be Formed by Characters.
     * Memory Usage: 40.7 MB, less than 100.00% of Java online submissions for Find Words That Can Be Formed by Characters.
     */
    public static int countCharacters(final String[] words, final String chars) {
        int sum = 0;

        final List<String> charsList = Arrays.asList(chars.split(""));
        for (final String word : words) {
            boolean failed = false;
            final List<String> tmpChars = new ArrayList<>(charsList);
            final List<String> wordAsList = Arrays.asList(word.split(""));
            for (final String c : wordAsList) {
                if (tmpChars.contains(c)) {
                    tmpChars.remove(c);
                } else {
                    failed = true;
                    break;
                }
            }
            if (!failed) {
                sum+= word.length();
            }
        }

        return sum;
    }
}
