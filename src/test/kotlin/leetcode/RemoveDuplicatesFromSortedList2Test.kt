package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RemoveDuplicatesFromSortedList2Test {

    @Test
    fun `Remove Duplicates from Sorted List II`() {
        val sol = RemoveDuplicatesFromSortedList2()

        assertThat(sol.deleteDuplicates(createListNode(1, 2, 3, 3, 4, 4, 5)))
                .isEqualTo(createListNode(1, 2, 5))
        assertThat(sol.deleteDuplicates(createListNode(1, 1, 1, 2, 3)))
                .isEqualTo(createListNode(2, 3))
        assertThat(sol.deleteDuplicates(createListNode(1, 2, 3)))
                .isEqualTo(createListNode(1, 2, 3))
    }
}