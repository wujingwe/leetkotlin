package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BinaryTreeLevelOrderTraversalTest {

    @Test
    fun `Binary Tree Level Order Traversal`() {
        val sol = BinaryTreeLevelOrderTraversal()

        assertThat(sol.levelOrder(createTreeNodes(3, 9, 20, null, null, 15, 7)))
                .isEqualTo(listOf(
                        listOf(3),
                        listOf(9, 20),
                        listOf(15, 7)))
        assertThat(sol.levelOrder(createTreeNodes(1, 2, 3, 4, 5)))
                .isEqualTo(listOf(
                        listOf(1),
                        listOf(2, 3),
                        listOf(4, 5)))
    }
}
