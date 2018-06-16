package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MergeSortedArrayTest {

    @Test
    fun `Merge Sorted Array`() {
        val sol = MergeSortedArray()

        val array1 = intArrayOf(1, 2, 3, 0, 0, 0)
        sol.merge(array1, 3, intArrayOf(2, 5, 6), 3)
        assertThat(array1.toList()).isEqualTo(listOf(1, 2, 2, 3, 5, 6))

        val array2 = intArrayOf(1)
        sol.merge(array2, 1, intArrayOf(), 0)
        assertThat(array2.toList()).isEqualTo(listOf(1))

        val array3 = intArrayOf(4, 5, 6, 0, 0, 0)
        sol.merge(array3, 3, intArrayOf(1, 2, 3), 3)
        assertThat(array3.toList()).isEqualTo(listOf(1, 2, 3, 4, 5, 6))
    }
}
