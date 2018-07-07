package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SubstringWithConcatenationOfAllWordsTest {

    @Test
    fun `Substring with Concatenation of All Words`() {
        val sol = SubstringWithConcatenationOfAllWords()

        assertThat(sol.findSubstring("barfoothefoobarman", arrayOf("foo", "bar")))
                .isEqualTo(listOf(0, 9))

        assertThat(sol.findSubstring("wordgoodstudentgoodword", arrayOf("word", "student")))
                .isEqualTo(emptyList<Int>())

        assertThat(sol.findSubstring("wordgoodgoodgoodbestword", arrayOf("word", "good", "best", "word")))
                .isEqualTo(emptyList<Int>())

        assertThat(sol.findSubstring("", arrayOf()))
                .isEqualTo(emptyList<Int>())

        assertThat(sol.findSubstring("a", arrayOf()))
                .isEqualTo(emptyList<Int>())

        assertThat(sol.findSubstring("mississippi", arrayOf("mississippis")))
                .isEqualTo(emptyList<Int>())

        assertThat(sol.findSubstring("barfoofoobarthefoobarman", arrayOf("bar", "foo", "the")))
                .isEqualTo(listOf(6, 9, 12))

        assertThat(sol.findSubstring("wordgoodgoodgoodbestword", arrayOf("word", "good", "best", "good")))
                .isEqualTo(listOf(8))
    }
}