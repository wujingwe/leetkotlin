package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RemoveDuplicatesFromSortedListTest {

    @Test
    fun `Remove Duplicates from Sorted List`() {
        val sol = RemoveDuplicatesFromSortedList()
        assertThat(sol.deleteDuplicates(createListNode(1, 1, 2))).isEqualTo(createListNode(1, 2))
        assertThat(sol.deleteDuplicates(createListNode(1, 1, 2, 3, 3))).isEqualTo(createListNode(1, 2, 3))
        assertThat(sol.deleteDuplicates(createListNode(1, 1, 1))).isEqualTo(createListNode(1))
    }
}
