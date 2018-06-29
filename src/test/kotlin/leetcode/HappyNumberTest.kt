package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class HappyNumberTest {

    @Test
    fun `Happy Number`() {
        val sol = HappyNumber()
        assertThat(sol.isHappy(19)).isEqualTo(true)
    }
}
