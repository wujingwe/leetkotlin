package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SqrtTest {

    @Test
    fun `Sqrt(x)`() {
        val sol = Sqrt()
        assertThat(sol.mySqrt(8)).isEqualTo(2)
        assertThat(sol.mySqrt(4)).isEqualTo(2)
        assertThat(sol.mySqrt(1)).isEqualTo(1)
        assertThat(sol.mySqrt(6)).isEqualTo(2)
        assertThat(sol.mySqrt(0)).isEqualTo(0)
        assertThat(sol.mySqrt(2)).isEqualTo(1)
        assertThat(sol.mySqrt(2147395599)).isEqualTo(46339)
    }
}
