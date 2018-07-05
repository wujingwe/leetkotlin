package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RemoveLinkedListElementsTest {

    @Test
    fun `Remove Linked List Elements`() {
        val sol = RemoveLinkedListElements()
        assertThat(sol.removeElements(createListNode(1, 2, 6, 3, 4, 5, 6), 6))
                .isEqualTo(createListNode(1, 2, 3, 4, 5))
    }
}