package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RemoveDuplicatesFromSortedArray2Test {

    @Test
    fun `Remove Duplicates from Sorted Array II`() {
        val sol = RemoveDuplicatesFromSortedArray2()

        val array1 = intArrayOf(1, 1, 1, 2, 2, 3)
        assertThat(sol.removeDuplicates(array1)).isEqualTo(5)
        assertThat(array1.toList().subList(0, 5)).isEqualTo(listOf(1, 1, 2, 2, 3))

        val array2 = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        assertThat(sol.removeDuplicates(array2)).isEqualTo(7)
        assertThat(array2.toList().subList(0, 7)).isEqualTo(listOf(0, 0, 1, 1, 2, 3, 3))
    }
}