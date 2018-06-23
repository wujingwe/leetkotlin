package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MinimumDepthOfBinaryTreeTest {

    @Test
    fun `Minimum Depth of Binary Tree`() {
        val sol = MinimumDepthOfBinaryTree()

        assertThat(sol.minDepth(createTreeNodes(3, 9, 20, null, null, 15, 7)))
                .isEqualTo(2)

        assertThat(sol.minDepth(createTreeNodes(1, 2)))
                .isEqualTo(2)

        assertThat(sol.minDepth(createTreeNodes(1, 2, 3, 4, 5)))
                .isEqualTo(2)
    }
}
