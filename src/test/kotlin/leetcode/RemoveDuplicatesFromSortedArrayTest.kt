package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    fun `Remove Duplicates from Sorted Array`() {
        val sol = RemoveDuplicatesFromSortedArray()

        val array1 = intArrayOf(1, 1, 2)
        assertThat(sol.removeDuplicates(array1)).isEqualTo(2)
        assertThat(array1.asList().subList(0, 2)).isEqualTo(listOf(1, 2))

        val array2 = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        assertThat(sol.removeDuplicates(array2)).isEqualTo(5)
        assertThat(array2.asList().subList(0, 5)).isEqualTo(listOf(0, 1, 2, 3, 4))
    }
}
