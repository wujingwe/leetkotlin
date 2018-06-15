package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MaximumSubarrayTest {

    @Test
    fun `Maximum Subarray`() {
        val sol = MaximumSubarray()
        assertThat(sol.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))).isEqualTo(6)
        assertThat(sol.maxSubArray(intArrayOf(-2, 1))).isEqualTo(1)
    }
}
