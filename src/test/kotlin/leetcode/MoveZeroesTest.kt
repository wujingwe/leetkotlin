package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MoveZeroesTest {

    @Test
    fun `Move Zeroes`() {
        val sol = MoveZeroes()

        val array1 = intArrayOf(0, 1, 0, 3, 12)
        sol.moveZeroes(array1)
        assertThat(array1.toList()).isEqualTo(listOf(1, 3, 12, 0, 0))

        val array2 = intArrayOf(1)
        sol.moveZeroes(array2)
        assertThat(array2.toList()).isEqualTo(listOf(1))
    }
}
