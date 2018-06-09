package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LetterCombinationsOfPhoneNumberTest {

    @Test
    fun `Letter Combinations of a Phone Number`() {
        val sol = LetterCombinationsOfPhoneNumber()
        assertThat(sol.letterCombinations("23"))
                .isEqualTo(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        assertThat(sol.letterCombinations(""))
                .isEqualTo(emptyList<String>())
    }
}
