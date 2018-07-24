package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class UglyNumberTest {

    @Test
    fun `Ugly Number`() {
        val sol = UglyNumber()
        assertThat(sol.isUgly(0)).isEqualTo(false)
        assertThat(sol.isUgly(6)).isEqualTo(true)
        assertThat(sol.isUgly(8)).isEqualTo(true)
        assertThat(sol.isUgly(14)).isEqualTo(false)
    }
}
