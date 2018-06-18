package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MinimumPathSumTest {

    @Test
    fun `Minimum Path Sum`() {
        val sol = MinimumPathSum()
        assertThat(sol.minPathSum(arrayOf(
                intArrayOf(1, 3, 1),
                intArrayOf(1, 5, 1),
                intArrayOf(4, 2, 1)))).isEqualTo(7)
    }
}
