package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LowestCommonAncestorOfABinarySearchTreeTest {

    @Test
    fun `Lowest Common Ancestor of a Binary Search Tree`() {
        val sol = LowestCommonAncestorOfABinarySearchTree()
        assertThat(sol.lowestCommonAncestor(
                createTreeNodes(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5),
                TreeNode(2),
                TreeNode(8)).`val`).isEqualTo(6)

        assertThat(sol.lowestCommonAncestor(
                createTreeNodes(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5),
                TreeNode(2),
                TreeNode(4)).`val`).isEqualTo(2)
    }
}
