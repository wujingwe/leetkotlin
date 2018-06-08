package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ReverseIntegerTest {

    @Test
    fun `Reverse Integer`() {
        val sol = ReverseInteger()
        assertThat(sol.reverse(123)).isEqualTo(321)
        assertThat(sol.reverse(-123)).isEqualTo(-321)
        assertThat(sol.reverse(120)).isEqualTo(21)
        assertThat(sol.reverse(Int.MAX_VALUE)).isEqualTo(0)
        assertThat(sol.reverse(Int.MIN_VALUE)).isEqualTo(0)
    }
}