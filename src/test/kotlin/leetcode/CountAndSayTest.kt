package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CountAndSayTest {

    @Test
    fun `Count and Say`() {
        val sol = CountAndSay()
        assertThat(sol.countAndSay(1)).isEqualTo("1")
        assertThat(sol.countAndSay(2)).isEqualTo("11")
        assertThat(sol.countAndSay(3)).isEqualTo("21")
        assertThat(sol.countAndSay(4)).isEqualTo("1211")
        assertThat(sol.countAndSay(5)).isEqualTo("111221")
        assertThat(sol.countAndSay(6)).isEqualTo("312211")
    }
}
