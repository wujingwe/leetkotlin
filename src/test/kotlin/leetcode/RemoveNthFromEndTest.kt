package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RemoveNthFromEndTest {

    @Test
    fun `Remove Nth Node From End of List`() {
        val sol = RemoveNthFromEnd()
        assertThat(sol.removeNthFromEnd(createListNode(1, 2, 3, 4, 5), 2))
                .isEqualTo(createListNode(1, 2, 3, 5))

        assertThat(sol.removeNthFromEnd(createListNode(1), 1))
                .isEqualTo(null)

        assertThat(sol.removeNthFromEnd(createListNode(1, 2), 1))
                .isEqualTo(createListNode(1))
    }
}