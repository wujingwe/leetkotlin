package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ImplementQueueUsingStacksTest {

    @Test
    fun `Implement Queue using Stacks`() {
        val sol = ImplementQueueUsingStacks()
        sol.push(1)
        sol.push(2)
        assertThat(sol.peek()).isEqualTo(1)
        assertThat(sol.pop()).isEqualTo(1)
        assertThat(sol.empty()).isEqualTo(false)
    }
}
