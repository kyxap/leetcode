package io.github.kyxap.leetcode.easy;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MaximumDepthofNTreeTest {

    @Test
    public void test1() {
        final MaximumDepthofNTree.Node node3 = new MaximumDepthofNTree.Node(3, new ArrayList(){{
            add(new MaximumDepthofNTree.Node(5, new ArrayList<>()));
            add(new MaximumDepthofNTree.Node(6, new ArrayList<>()));
        }});

        final MaximumDepthofNTree.Node node1 = new MaximumDepthofNTree.Node(1, new ArrayList(){{
            add(node3);
            add(new MaximumDepthofNTree.Node(2, new ArrayList<>()));
            add(new MaximumDepthofNTree.Node(4, new ArrayList<>()));
        }});

        assertEquals(3, MaximumDepthofNTree.maxDepth(node1));
    }

}
