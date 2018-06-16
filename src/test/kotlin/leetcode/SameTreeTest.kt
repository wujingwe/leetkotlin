package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SameTreeTest {

    @Test
    fun `Same Tree`() {
        val sol = SameTree()
        assertThat(sol.isSameTree(createTreeNodes(1, 2, 3), createTreeNodes(1, 2, 3))).isEqualTo(true)
        assertThat(sol.isSameTree(createTreeNodes(1, 2), createTreeNodes(1, null, 2))).isEqualTo(false)
        assertThat(sol.isSameTree(createTreeNodes(1, 2, 1), createTreeNodes(1, 1, 2))).isEqualTo(false)
    }
}
