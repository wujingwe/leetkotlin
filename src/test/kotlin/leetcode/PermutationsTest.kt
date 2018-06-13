package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PermutationsTest {

    @Test
    fun `Permutations `() {
        val sol = Permutations()
        assertThat(sol.permute(intArrayOf(1, 2, 3))).isEqualTo(listOf(
                listOf(1, 2, 3),
                listOf(1, 3, 2),
                listOf(2, 1, 3),
                listOf(2, 3, 1),
                listOf(3, 2, 1),
                listOf(3, 1, 2)))
    }
}
