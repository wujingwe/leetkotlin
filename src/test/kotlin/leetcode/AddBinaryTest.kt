package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AddBinaryTest {

    @Test
    fun `Add Binary`() {
        val sol = AddBinary()
        assertThat(sol.addBinary("11", "1")).isEqualTo("100")
        assertThat(sol.addBinary("1010", "1011")).isEqualTo("10101")
    }
}
