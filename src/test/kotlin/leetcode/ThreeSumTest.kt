package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ThreeSumTest {

    @Test
    fun `3Sum`() {
        val sol = ThreeSum()
        val result = sol.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        assertThat(result.size).isEqualTo(2)
        assertThat(result[0]).isEqualTo(listOf(-1, -1, 2))
        assertThat(result[1]).isEqualTo(listOf(-1, 0, 1))
    }
}