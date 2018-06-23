package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BinaryTreeLevelOrderTraversal2Test {

    @Test
    fun `Binary Tree Level Order Traversal II`() {
        val sol = BinaryTreeLevelOrderTraversal2()
        assertThat(sol.levelOrderBottom(createTreeNodes(3, 9, 20, null, null, 15, 7)))
                .isEqualTo(listOf(
                        listOf(15, 7),
                        listOf(9, 20),
                        listOf(3)))

        assertThat(sol.levelOrderBottom(createTreeNodes(1, 2)))
                .isEqualTo(listOf(
                        listOf(2),
                        listOf(1)))

        assertThat(sol.levelOrderBottom(createTreeNodes(1)))
                .isEqualTo(listOf(
                        listOf(1)))

        assertThat(sol.levelOrderBottom(createTreeNodes(1, 2, null, 3, null, 4, null, 5)))
                .isEqualTo(listOf(
                        listOf(5),
                        listOf(4),
                        listOf(3),
                        listOf(2),
                        listOf(1)))

        assertThat(sol.levelOrderBottom(createTreeNodes(1, 2, 3, 4, 5)))
                .isEqualTo(listOf(
                        listOf(4, 5),
                        listOf(2, 3),
                        listOf(1)))
    }
}
