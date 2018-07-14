package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    fun `Binary Tree Zigzag Level Order Traversal`() {
        val sol = BinaryTreeZigzagLevelOrderTraversal()

        assertThat(sol.zigzagLevelOrder(createTreeNodes(3, 9, 20, null, null, 15, 7)))
                .isEqualTo(listOf(
                        listOf(3),
                        listOf(20, 9),
                        listOf(15, 7)))
        assertThat(sol.zigzagLevelOrder(createTreeNodes(1, 2, 3, 4, 5)))
                .isEqualTo(listOf(
                        listOf(1),
                        listOf(3, 2),
                        listOf(4, 5)))
    }
}
