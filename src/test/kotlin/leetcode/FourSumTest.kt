package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FourSumTest {

    @Test
    fun `4Sum`() {
        val sol = FourSum()
        assertThat(sol.fourSum(intArrayOf(1, 0, -1, 0, -2, 2), 0))
                .isEqualTo(listOf(
                        listOf(-2, -1, 1, 2),
                        listOf(-2,  0, 0, 2),
                        listOf(-1,  0, 0, 1)))

        assertThat(sol.fourSum(intArrayOf(0, 0, 0, 0), 0))
                .isEqualTo(listOf(
                        listOf(0, 0, 0, 0)))

        assertThat(sol.fourSum(intArrayOf(-3, -2, -1, 0, 0, 1, 2, 3), 0))
                .isEqualTo(listOf(
                        listOf(-3, -2, 2, 3),
                        listOf(-3, -1, 1, 3),
                        listOf(-3, 0, 0, 3),
                        listOf(-3, 0, 1, 2),
                        listOf(-2, -1, 0, 3),
                        listOf(-2, -1, 1, 2),
                        listOf(-2, 0, 0, 2),
                        listOf(-1, 0, 0, 1)))

        assertThat(sol.fourSum(intArrayOf(-1, -5, -5, -3, 2, 5, 0, 4), -7))
                .isEqualTo(listOf(
                        listOf(-5, -5, -1, 4),
                        listOf(-5, -3, -1, 2)))
    }
}