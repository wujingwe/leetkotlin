package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ReverseNodesInKGroupTest {

    @Test
    fun `Reverse Nodes in k-Group`() {
        val sol = ReverseNodesInKGroup()

        assertThat(sol.reverseKGroup(createListNode(1, 2, 3, 4, 5), 2))
                .isEqualTo(createListNode(2, 1, 4, 3, 5))

        assertThat(sol.reverseKGroup(createListNode(1, 2, 3, 4, 5), 3))
                .isEqualTo(createListNode(3, 2, 1, 4, 5))
    }
}