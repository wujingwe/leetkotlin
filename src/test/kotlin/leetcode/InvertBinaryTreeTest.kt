package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class InvertBinaryTreeTest {

    @Test
    fun `Invert Binary Tree`() {
        val sol = InvertBinaryTree()

        assertThat(sol.invertTree(createTreeNodes(4, 2, 7, 1, 3, 6, 9)))
                .isEqualTo(createTreeNodes(4, 7, 2, 9, 6, 3, 1))
    }
}
