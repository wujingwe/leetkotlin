package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CombinationSumTest {

    @Test
    fun `Combination Sum`() {
        val sol = CombinationSum()
        assertThat(sol.combinationSum(intArrayOf(2, 3, 6, 7), 7))
                .isEqualTo(listOf(
                        listOf(2, 2, 3),
                        listOf(7)))

        assertThat(sol.combinationSum(intArrayOf(2, 3, 5), 8))
                .isEqualTo(listOf(
                        listOf(2, 2, 2, 2),
                        listOf(2, 3, 3),
                        listOf(3, 5)))

        assertThat(sol.combinationSum(intArrayOf(8, 7, 4, 3), 11))
                .isEqualTo(listOf(
                        listOf(8, 3),
                        listOf(7, 4),
                        listOf(4, 4, 3)))

        assertThat(sol.combinationSum(intArrayOf(4, 2, 8), 8))
                .isEqualTo(listOf(
                        listOf(4, 4),
                        listOf(4, 2, 2),
                        listOf(2, 2, 2, 2),
                        listOf(8)))
    }
}
