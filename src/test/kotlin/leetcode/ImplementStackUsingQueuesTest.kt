package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ImplementStackUsingQueuesTest {

    @Test
    fun `Implement Stack using Queues`() {
        val sol = ImplementStackUsingQueues()
        sol.push(1)
        sol.push(2)
        assertThat(sol.top()).isEqualTo(2)
        assertThat(sol.pop()).isEqualTo(2)
        assertThat(sol.empty()).isEqualTo(false)
    }
}
