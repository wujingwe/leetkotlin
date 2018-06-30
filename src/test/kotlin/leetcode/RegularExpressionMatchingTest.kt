package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RegularExpressionMatchingTest {

    @Test
    fun `Regular Expression Matching`() {
        val sol = RegularExpressionMatching()

        assertThat(sol.isMatch("a", ".*..a*")).isEqualTo(false)
        assertThat(sol.isMatch("ab", ".*c")).isEqualTo(false)
        assertThat(sol.isMatch("aa", "a")).isEqualTo(false)
        assertThat(sol.isMatch("a", "")).isEqualTo(false)
        assertThat(sol.isMatch("mississippi", "mis*is*p*.")).isEqualTo(false)
        assertThat(sol.isMatch("", "a")).isEqualTo(false)
        assertThat(sol.isMatch("aaa", "aaaa")).isEqualTo(false)

        assertThat(sol.isMatch("a", ".*")).isEqualTo(true)
        assertThat(sol.isMatch("bbbba", ".*a*a")).isEqualTo(true)
        assertThat(sol.isMatch("", "")).isEqualTo(true)
        assertThat(sol.isMatch("", ".*")).isEqualTo(true)
        assertThat(sol.isMatch("a", "ab*")).isEqualTo(true)
        assertThat(sol.isMatch("aaa", "ab*a*c*a")).isEqualTo(true)
        assertThat(sol.isMatch("aaa", "a*a")).isEqualTo(true)
        assertThat(sol.isMatch("aa", "a*")).isEqualTo(true)
        assertThat(sol.isMatch("ab", ".*")).isEqualTo(true)
        assertThat(sol.isMatch("aab", "c*a*b")).isEqualTo(true)
    }
}
