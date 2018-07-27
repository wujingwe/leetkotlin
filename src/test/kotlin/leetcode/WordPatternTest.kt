package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class WordPatternTest {

    @Test
    fun `Word Pattern`() {
        val sol = WordPattern()

        assertThat(sol.wordPattern("abba", "dog cat cat dog")).isEqualTo(true)
        assertThat(sol.wordPattern("abba", "dog cat cat fish")).isEqualTo(false)
        assertThat(sol.wordPattern("aaaa", "dog cat cat dog")).isEqualTo(false)
        assertThat(sol.wordPattern("abba", "dog dog dog dog")).isEqualTo(false)
    }
}
