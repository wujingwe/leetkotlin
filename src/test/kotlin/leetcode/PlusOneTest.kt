package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PlusOneTest {

    @Test
    fun `Plus One`() {
        val sol = PlusOne()
        assertThat(sol.plusOne(intArrayOf(1, 2, 3)).toList()).isEqualTo(listOf(1, 2, 4))
        assertThat(sol.plusOne(intArrayOf(4, 3, 2, 1)).toList()).isEqualTo(listOf(4, 3, 2, 2))
        assertThat(sol.plusOne(intArrayOf(9, 9)).toList()).isEqualTo(listOf(1, 0, 0))
    }
}
