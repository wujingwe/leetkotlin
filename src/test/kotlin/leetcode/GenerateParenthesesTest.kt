package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class GenerateParenthesesTest {

    @Test
    fun `Generate Parentheses`() {
        val sol = GenerateParentheses()
        assertThat(sol.generateParenthesis(3)).isEqualTo(listOf(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"))
    }
}
