package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PascalTriangle2Test {

    @Test
    fun `Pascal's Triangle II`() {
        val sol = PascalTriangle2()
        assertThat(sol.getRow(3)).isEqualTo(listOf(1, 3, 3, 1))
        assertThat(sol.getRow(4)).isEqualTo(listOf(1, 4, 6, 4, 1))
    }
}
