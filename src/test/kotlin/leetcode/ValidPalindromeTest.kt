package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ValidPalindromeTest {

    @Test
    fun `Valid Palindrome`() {
        val sol = ValidPalindrome()

        assertThat(sol.isPalindrome("A man, a plan, a canal: Panama")).isEqualTo(true)
        assertThat(sol.isPalindrome("race a car")).isEqualTo(false)
        assertThat(sol.isPalindrome(".,")).isEqualTo(true)
        assertThat(sol.isPalindrome("0P")).isEqualTo(false)
    }
}