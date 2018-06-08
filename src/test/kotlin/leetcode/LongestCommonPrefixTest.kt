package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LongestCommonPrefixTest {

    @Test
    fun `Longest Common Prefix`() {
        val sol = LongestCommonPrefix()
        assertThat(sol.longestCommonPrefix(arrayOf("flower", "flow", "flight"))).isEqualTo("fl")
        assertThat(sol.longestCommonPrefix(arrayOf("dog", "racecar", "car"))).isEqualTo("")
        assertThat(sol.longestCommonPrefix(arrayOf(""))).isEqualTo("")
    }
}