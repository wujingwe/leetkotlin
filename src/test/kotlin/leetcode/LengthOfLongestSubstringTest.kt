package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LengthOfLongestSubstringTest {

    @Test
    fun `Longest Substring Without Repeating Characters`() {
        val sol = LengthOfLongestSubstring()
        assertThat(sol.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3)
        assertThat(sol.lengthOfLongestSubstring("bbbbb")).isEqualTo(1)
        assertThat(sol.lengthOfLongestSubstring("pwwkew")).isEqualTo(3)
    }
}