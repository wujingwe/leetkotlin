package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class IntegerToRomanTest {

    @Test
    fun `Integer to Roman`() {
        val sol = IntegerToRoman()

        assertThat(sol.intToRoman(3)).isEqualTo("III")
        assertThat(sol.intToRoman(4)).isEqualTo("IV")
        assertThat(sol.intToRoman(9)).isEqualTo("IX")
        assertThat(sol.intToRoman(58)).isEqualTo("LVIII")
        assertThat(sol.intToRoman(1994)).isEqualTo("MCMXCIV")
    }
}