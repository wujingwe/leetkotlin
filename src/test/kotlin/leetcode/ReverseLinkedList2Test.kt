package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ReverseLinkedList2Test {

    @Test
    fun `Reverse Linked List II`() {
        val sol = ReverseLinkedList2()
        assertThat(sol.reverseBetween(createListNode(1, 2, 3, 4, 5), 2, 4)).isEqualTo(
                createListNode(1, 4, 3, 2, 5))
        assertThat(sol.reverseBetween(createListNode(3, 5), 1, 2)).isEqualTo(
                createListNode(5, 3))
    }
}
