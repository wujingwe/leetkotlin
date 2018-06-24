package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class WordSearchTest {

    @Test
    fun `Word Search`() {
        val sol = WordSearch()

        assertThat(sol.exist(arrayOf(
                charArrayOf('A','B','C','E'),
                charArrayOf('S','F','C','S'),
                charArrayOf('A','D','E','E')), "ABCCED"))
                .isEqualTo(true)

        assertThat(sol.exist(arrayOf(
                charArrayOf('A','B','C','E'),
                charArrayOf('S','F','C','S'),
                charArrayOf('A','D','E','E')), "SEE"))
                .isEqualTo(true)

        assertThat(sol.exist(arrayOf(
                charArrayOf('A','B','C','E'),
                charArrayOf('S','F','C','S'),
                charArrayOf('A','D','E','E')), "ABCB"))
                .isEqualTo(false)

        assertThat(sol.exist(arrayOf(
                charArrayOf('a')), "a"))
                .isEqualTo(true)

        assertThat(sol.exist(arrayOf(
                charArrayOf('a', 'b')), "ba"))
                .isEqualTo(true)
    }
}
