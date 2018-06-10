package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class StrStrTest {

    @Test
    fun `Implement strStr()`() {
        val sol = StrStr()
        assertThat(sol.strStr("hello", "ll")).isEqualTo(2)
        assertThat(sol.strStr("hello", "lo")).isEqualTo(3)
        assertThat(sol.strStr("aaaaa", "bba")).isEqualTo(-1)
        assertThat(sol.strStr("aaa", "aaaa")).isEqualTo(-1)
        assertThat(sol.strStr("", "a")).isEqualTo(-1)
        assertThat(sol.strStr("aaa", "")).isEqualTo(0)
        assertThat(sol.strStr("mississippi", "issipi")).isEqualTo(-1)
    }
}
