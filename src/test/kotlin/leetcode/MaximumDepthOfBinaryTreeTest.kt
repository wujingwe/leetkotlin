package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MaximumDepthOfBinaryTreeTest {

    @Test
    fun `Maximum Depth of Binary Tree`() {
        val sol = MaximumDepthOfBinaryTree()
        assertThat(sol.maxDepth(createTreeNodes(3, 9, 20, null, null, 15, 7))).isEqualTo(3)
    }
}
