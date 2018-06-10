package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SwapNodesInPairsTest {

    @Test
    fun `Swap Nodes in Pairs`() {
        val sol = SwapNodesInPairs()
        val result = sol.swapPairs(createListNode(1, 2, 3 ,4))
        assertThat(result).isEqualTo(createListNode(2, 1, 4, 3))
    }
}
