package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Search2DMatrixTest {

    @Test
    fun `Search a 2D Matrix`() {
        val sol = Search2DMatrix()
        assertThat(sol.searchMatrix(arrayOf(
                intArrayOf(1, 3, 5, 7),
                intArrayOf(10, 11, 16, 20),
                intArrayOf(23, 30, 34, 50)), 3)).isEqualTo(true)

        assertThat(sol.searchMatrix(arrayOf(
                intArrayOf(1, 3, 5, 7),
                intArrayOf(10, 11, 16, 20),
                intArrayOf(23, 30, 34, 50)), 13)).isEqualTo(false)

        assertThat(sol.searchMatrix(arrayOf(
                intArrayOf(1)), 1)).isEqualTo(true)
    }
}
