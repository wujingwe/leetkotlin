package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MergeTwoSortedListsTest {

    @Test
    fun `Merge Two Sorted Lists`() {
        val sol = MergeTwoSortedLists()
        val result = sol.mergeTwoLists(
                createListNode(1, 2, 4),
                createListNode(1, 3, 4))
        assertThat(result).isEqualTo(createListNode(1, 1, 2, 3, 4, 4))
    }
}
