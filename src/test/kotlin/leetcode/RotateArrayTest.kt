package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RotateArrayTest {

    @Test
    fun `Rotate Array`() {
        val sol = RotateArray()

        val array1 = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        sol.rotate(array1, 3)
        assertThat(array1.toList()).isEqualTo(listOf(5, 6, 7, 1, 2, 3, 4))

        val array2 = intArrayOf(-1, -100, 3, 99)
        sol.rotate(array2, 2)
        assertThat(array2.toList()).isEqualTo(listOf(3, 99, -1, -100))

        val array3 = intArrayOf(-1)
        sol.rotate(array3, 2)
        assertThat(array3.toList()).isEqualTo(listOf(-1))
    }
}