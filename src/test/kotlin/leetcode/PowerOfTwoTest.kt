package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PowerOfTwoTest {

    @Test
    fun `Power of Two`() {
        val sol = PowerOfTwo()

        assertThat(sol.isPowerOfTwo(1)).isEqualTo(true)
        assertThat(sol.isPowerOfTwo(16)).isEqualTo(true)
        assertThat(sol.isPowerOfTwo(218)).isEqualTo(false)
    }
}
