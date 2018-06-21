package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CombinationsTest {

    @Test
    fun `Combinations `() {
        val sol = Combinations()
        assertThat(sol.combine(4, 2)).isEqualTo(listOf(
                listOf(1, 2),
                listOf(1, 3),
                listOf(1, 4),
                listOf(2, 3),
                listOf(2, 4),
                listOf(3, 4)))
    }
}
