package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BalancedBinaryTreeTest {

    @Test
    fun `Balanced Binary Tree`() {
        val sol = BalancedBinaryTree()

        assertThat(sol.isBalanced(createTreeNodes(3, 9, 20, null, null, 15, 7)))
                .isEqualTo(true)

        assertThat(sol.isBalanced(createTreeNodes(1, 2, 2, 3, 3, null, null, 4, 4)))
                .isEqualTo(false)

        assertThat(sol.isBalanced(createTreeNodes(1, null, 2, null, 3)))
                .isEqualTo(false)

        assertThat(sol.isBalanced(createTreeNodes(1, 2, 2, 3, null, null, 3, 4, null, null, 4)))
                .isEqualTo(false)
    }
}
