package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ValidAnagramTest {

    @Test
    fun `Valid Anagram`() {
        val sol = ValidAnagram()
        assertThat(sol.isAnagram("anagram", "nagaram")).isEqualTo(true)
        assertThat(sol.isAnagram("rat", "car")).isEqualTo(false)
        assertThat(sol.isAnagram("aacc", "ccac")).isEqualTo(false)
    }
}
