package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class UniquePathsIITest {

    @Test
    fun `Unique Paths II`() {
        val sol = UniquePathsII()
        assertThat(sol.uniquePathsWithObstacles(arrayOf(
                intArrayOf(0, 0, 0),
                intArrayOf(0, 1, 0),
                intArrayOf(0, 0, 0)))).isEqualTo(2)

        assertThat(sol.uniquePathsWithObstacles(arrayOf(
                intArrayOf(0, 0),
                intArrayOf(0, 1)))).isEqualTo(0)

        assertThat(sol.uniquePathsWithObstacles(arrayOf(
                intArrayOf(0, 1)))).isEqualTo(0)
    }
}
