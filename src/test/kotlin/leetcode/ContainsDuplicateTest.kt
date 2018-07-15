package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ContainsDuplicateTest {

    @Test
    fun `Contains Duplicate`() {
        val sol = ContainsDuplicate()

        assertThat(sol.containsDuplicate(intArrayOf(1, 2, 3, 1))).isEqualTo(true)
        assertThat(sol.containsDuplicate(intArrayOf(1, 2, 3, 4))).isEqualTo(false)
        assertThat(sol.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))).isEqualTo(true)
    }
}
