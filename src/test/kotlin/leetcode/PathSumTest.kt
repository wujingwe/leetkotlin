package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PathSumTest {

    @Test
    fun `Path Sum`() {
        val sol = PathSum()
        assertThat(sol.hasPathSum(
                createTreeNodes(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1), 22)).isEqualTo(true)
        assertThat(sol.hasPathSum(
                null, 0)).isEqualTo(false)
    }
}
