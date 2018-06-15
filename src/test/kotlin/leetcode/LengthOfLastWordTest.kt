package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LengthOfLastWordTest {

    @Test
    fun `Length of Last Word`() {
        val sol = LengthOfLastWord()
        assertThat(sol.lengthOfLastWord("Hello World")).isEqualTo(5)
        assertThat(sol.lengthOfLastWord("a")).isEqualTo(1)
        assertThat(sol.lengthOfLastWord("a ")).isEqualTo(1)
        assertThat(sol.lengthOfLastWord("")).isEqualTo(0)
    }
}
