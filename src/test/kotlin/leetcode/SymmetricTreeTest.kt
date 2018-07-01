package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SymmetricTreeTest {

    @Test
    fun `Symmetric Tree`() {
        val sol = SymmetricTree()

        assertThat(sol.isSymmetric(createTreeNodes(1, 2, 2, 3, 4, 4, 3))).isEqualTo(true)
        assertThat(sol.isSymmetric(createTreeNodes(1, 2, 2, null, 3, null, 3))).isEqualTo(false)
    }
}