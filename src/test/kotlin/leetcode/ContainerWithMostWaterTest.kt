package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ContainerWithMostWaterTest {

    @Test
    fun `Container With Most Water`() {
        val sol = ContainerWithMostWater()

        assertThat(sol.maxArea(intArrayOf(1, 1))).isEqualTo(1)
        assertThat(sol.maxArea(intArrayOf(1, 7, 6, 1))).isEqualTo(6)
    }
}
