package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MajorityElementTest {

    @Test
    fun `Majority Element`() {
        val sol = MajorityElement()

        assertThat(sol.majorityElement(intArrayOf(3, 2, 3))).isEqualTo(3)
        assertThat(sol.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2))).isEqualTo(2)
        assertThat(sol.majorityElement(intArrayOf(3, 3, 4))).isEqualTo(3)
    }
}