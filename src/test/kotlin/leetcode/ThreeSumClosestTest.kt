package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ThreeSumClosestTest {

    @Test
    fun `3Sum Closest`() {
        val sol = ThreeSumClosest()
        val result = sol.threeSumClosest(intArrayOf(-1, 2, 1, -4), 1)
        assertThat(result).isEqualTo(2)
    }
}
