package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class UniquePathsTest {

    @Test
    fun `Unique Paths`() {
        val sol = UniquePaths()
        assertThat(sol.uniquePaths(3, 2)).isEqualTo(3)
        assertThat(sol.uniquePaths(7, 3)).isEqualTo(28)
    }
}
