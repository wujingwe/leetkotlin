package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class GroupAnagramsTest {

    @Test
    fun `Group Anagrams`() {
        val sol = GroupAnagrams()
        assertThat(sol.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))).isEqualTo(
                listOf(
                        listOf("eat", "tea", "ate"),
                        listOf("tan", "nat"),
                        listOf("bat")))
    }
}
