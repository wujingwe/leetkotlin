package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PalindromeNumberTest {

    @Test
    fun `Palindrome Number`() {
        val sol = PalindromeNumber()
        assertThat(sol.isPalindrome(121)).isEqualTo(true)
        assertThat(sol.isPalindrome(-121)).isEqualTo(false)
        assertThat(sol.isPalindrome(10)).isEqualTo(false)
    }
}
