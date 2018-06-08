package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LongestPalindromeTest {

    @Test
    fun `Longest Palindromic Substring`() {
        val sol = LongestPalindrome()
        assertThat(sol.longestPalindrome("babad")).isEqualTo("bab")
        assertThat(sol.longestPalindrome("cbbd")).isEqualTo("bb")
    }
}
