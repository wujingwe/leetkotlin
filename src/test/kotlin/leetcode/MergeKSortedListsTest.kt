package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MergeKSortedListsTest {

    @Test
    fun `Merge k Sorted Lists`() {
        val sol = MergeKSortedLists()

        assertThat(sol.mergeKLists(
                arrayOf(
                        createListNode(1, 4, 5),
                        createListNode(1, 3, 4),
                        createListNode(2, 6))))
                .isEqualTo(createListNode(1, 1, 2, 3, 4, 4, 5, 6))
        
        assertThat(sol.mergeKLists(
                arrayOf(
                        createListNode(-2, -1, -1, -1),
                        null)))
                .isEqualTo(createListNode(-2, -1, -1, -1))
    }
}