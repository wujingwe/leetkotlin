package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class HouseRobberTest {

    @Test
    fun `House Robber`() {
        val sol = HouseRobber()
        assertThat(sol.rob(intArrayOf(1, 2, 3, 1))).isEqualTo(4)
        assertThat(sol.rob(intArrayOf(2, 7, 9, 3, 1))).isEqualTo(12)
        assertThat(sol.rob(intArrayOf(2, 1, 1, 2))).isEqualTo(4)
    }
}
