package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ClimbingStairsTest {

    @Test
    fun `Climbing Stairs`() {
        val sol = ClimbingStairs()
        assertThat(sol.climbStairs(2)).isEqualTo(2)
        assertThat(sol.climbStairs(3)).isEqualTo(3)
    }
}
