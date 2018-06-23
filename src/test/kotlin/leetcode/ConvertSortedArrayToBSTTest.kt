package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ConvertSortedArrayToBSTTest {

    @Test
    fun `Convert Sorted Array to Binary Search Tree`() {
        val sol = ConvertSortedArrayToBST()

        assertThat(sol.sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9)))
                .isEqualTo(createTreeNodes(0, -10, 5, null, -3, null, 9))

        assertThat(sol.sortedArrayToBST(intArrayOf())).isNull()
    }
}
