package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RangeSumQueryTest {

    @Test
    fun `Range Sum Query - Immutable`() {
        val sol = RangeSumQuery(intArrayOf(-2, 0, 3, -5, 2, -1))
        
        assertThat(sol.sumRange(0, 2)).isEqualTo(1)
        assertThat(sol.sumRange(2, 5)).isEqualTo(-1)
        assertThat(sol.sumRange(0, 5)).isEqualTo(-3)
    }
}
