package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SortColorsTest {

    @Test
    fun `Sort Colors`() {
        val sol = SortColors()

        val array1 = intArrayOf(2, 0, 2, 1, 1, 0)
        sol.sortColors(array1)
        assertThat(array1.toList()).isEqualTo(listOf(0, 0, 1, 1, 2, 2))

        val array2 = intArrayOf(1, 0, 1)
        sol.sortColors(array2)
        assertThat(array2.toList()).isEqualTo(listOf(0, 1, 1))

        val array3 = intArrayOf(0)
        sol.sortColors(array3)
        assertThat(array3.toList()).isEqualTo(listOf(0))
    }
}
