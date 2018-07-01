package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MinStackTest {

    @Test
    fun `Min Stack`() {
        val sol = MinStack()
        sol.push(-2)
        sol.push(0)
        sol.push(-3)
        assertThat(sol.getMin()).isEqualTo(-3)

        sol.pop()
        assertThat(sol.top()).isEqualTo(0)
        assertThat(sol.getMin()).isEqualTo(-2)
    }
}