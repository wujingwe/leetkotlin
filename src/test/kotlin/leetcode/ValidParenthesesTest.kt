package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ValidParenthesesTest {

    @Test
    fun `Valid Parentheses`() {
        val sol = ValidParentheses()
        assertThat(sol.isValid("()")).isEqualTo(true)
        assertThat(sol.isValid("()[]{}")).isEqualTo(true)
        assertThat(sol.isValid("(]")).isEqualTo(false)
        assertThat(sol.isValid("([)]")).isEqualTo(false)
        assertThat(sol.isValid("{[]}")).isEqualTo(true)
    }
}
