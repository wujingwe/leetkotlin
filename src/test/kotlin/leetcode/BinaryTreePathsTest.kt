package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BinaryTreePathsTest {

    @Test
    fun `Binary Tree Paths`() {
        val sol = BinaryTreePaths()
        assertThat(sol.binaryTreePaths(createTreeNodes(1, 2, 3, null, 5)))
                .isEqualTo(listOf("1->2->5", "1->3"))
    }
}
