package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AddDigitsTest {

    @Test
    fun `Add Digits`() {
        val sol = AddDigits()
        assertThat(sol.addDigits(38)).isEqualTo(2)
    }
}
