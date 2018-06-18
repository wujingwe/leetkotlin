package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SimplifyPathTest {

    @Test
    fun `Simplify Path`() {
        val sol = SimplifyPath()
        assertThat(sol.simplifyPath("/home/")).isEqualTo("/home")
        assertThat(sol.simplifyPath("/a/./b/../../c/")).isEqualTo("/c")
        assertThat(sol.simplifyPath("/../")).isEqualTo("/")
        assertThat(sol.simplifyPath("/")).isEqualTo("/")
        assertThat(sol.simplifyPath("/home//foo/")).isEqualTo("/home/foo")
    }
}
