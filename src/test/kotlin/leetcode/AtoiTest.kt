package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AtoiTest {

    @Test
    fun `String to Integer (atoi)`() {
        val sol = Atoi()
        assertThat(sol.atoi("")).isEqualTo(0)
        assertThat(sol.atoi("+1")).isEqualTo(1)
        assertThat(sol.atoi("42")).isEqualTo(42)
        assertThat(sol.atoi("   -42")).isEqualTo(-42)
        assertThat(sol.atoi("4193 with words")).isEqualTo(4193)
        assertThat(sol.atoi("words and 987")).isEqualTo(0)
        assertThat(sol.atoi("-91283472332")).isEqualTo(Int.MIN_VALUE)
        assertThat(sol.atoi("9223372036854775808")).isEqualTo(Int.MAX_VALUE)
    }
}