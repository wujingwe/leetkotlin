package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SetMatrixZeroesTest {

    @Test
    fun `Set Matrix Zeroes`() {
        val sol = SetMatrixZeroes()

        val array1 = arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 1))
        sol.setZeroes(array1)
        assertThat(array1.map { it.toList() }).isEqualTo(listOf(
                listOf(1, 0, 1),
                listOf(0, 0, 0),
                listOf(1, 0, 1)))

        val array2 = arrayOf(
                intArrayOf(0, 1, 2, 0),
                intArrayOf(3, 4, 5, 2),
                intArrayOf(1, 3, 1, 5))
        sol.setZeroes(array2)
        assertThat(array2.map { it.toList() }).isEqualTo(listOf(
                listOf(0, 0, 0, 0),
                listOf(0, 4, 5, 0),
                listOf(0, 3, 1, 0)))

        val array3 = arrayOf(
                intArrayOf(1, 0, 3))
        sol.setZeroes(array3)
        assertThat(array3.map { it.toList() }).isEqualTo(listOf(
                listOf(0, 0, 0)))
    }
}
