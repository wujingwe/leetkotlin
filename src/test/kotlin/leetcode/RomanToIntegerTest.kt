package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RomanToIntegerTest {

    @Test
    fun `Roman to Integer`() {
        val sol = RomanToInteger()

        assertThat(sol.romanToInt("III")).isEqualTo(3)
        assertThat(sol.romanToInt("IV")).isEqualTo(4)
        assertThat(sol.romanToInt("IX")).isEqualTo(9)
        assertThat(sol.romanToInt("LVIII")).isEqualTo(58)
        assertThat(sol.romanToInt("MCMXCIV")).isEqualTo(1994)
    }
}