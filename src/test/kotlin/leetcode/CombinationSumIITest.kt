package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CombinationSumIITest {

    @Test
    fun `Combination Sum II`() {
        val sol = CombinationSumII()
        assertThat(sol.combinationSum2(intArrayOf(10, 1, 2, 7, 6, 1, 5), 8))
                .isEqualTo(listOf(
                        listOf(1, 1, 6),
                        listOf(1, 2, 5),
                        listOf(1, 7),
                        listOf(2, 6)))

        assertThat(sol.combinationSum2(intArrayOf(2, 5, 2, 1, 2), 5))
                .isEqualTo(listOf(
                        listOf(1, 2, 2),
                        listOf(5)))
    }
}
