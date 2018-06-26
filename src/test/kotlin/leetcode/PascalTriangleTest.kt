package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PascalTriangleTest {

    @Test
    fun `Pascal's Triangle`() {
        val sol = PascalTriangle()
        assertThat(sol.generate(5)).isEqualTo(
                listOf(
                        listOf(1),
                        listOf(1, 1),
                        listOf(1, 2, 1),
                        listOf(1, 3, 3, 1),
                        listOf(1, 4, 6, 4, 1)))
    }
}
