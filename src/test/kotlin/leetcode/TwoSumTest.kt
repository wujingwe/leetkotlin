package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class TwoSumTest {

    @Test
    fun `Two Sum`() {
        val sol = TwoSum()
        val result = sol.twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertThat(result[0]).isEqualTo(0)
        assertThat(result[1]).isEqualTo(1)
    }
}
