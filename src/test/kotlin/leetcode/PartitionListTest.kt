package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PartitionListTest {

    @Test
    fun `Partition List`() {
        val sol = PartitionList()

        assertThat(sol.partition(createListNode(1, 4, 3, 2, 5, 2), 3))
                .isEqualTo(createListNode(1, 2, 2, 4, 3, 5))
    }
}