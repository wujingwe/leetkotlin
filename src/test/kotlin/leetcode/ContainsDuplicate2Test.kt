package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ContainsDuplicate2Test {

    @Test
    fun `Contains Duplicate II`() {
        val sol = ContainsDuplicate2()

        assertThat(sol.containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3)).isEqualTo(true)
        assertThat(sol.containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1)).isEqualTo(true)
        assertThat(sol.containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2)).isEqualTo(false)
    }
}
