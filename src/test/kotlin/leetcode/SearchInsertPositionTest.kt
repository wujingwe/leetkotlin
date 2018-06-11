package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SearchInsertPositionTest {

    @Test
    fun `Search Insert Position`() {
        val sol = SearchInsertPosition()
        assertThat(sol.searchInsert(intArrayOf(1, 3, 5, 6), 5)).isEqualTo(2)
        assertThat(sol.searchInsert(intArrayOf(1, 3, 5, 6), 2)).isEqualTo(1)
        assertThat(sol.searchInsert(intArrayOf(1, 3, 5, 6), 7)).isEqualTo(4)
        assertThat(sol.searchInsert(intArrayOf(1, 3, 5, 6), 0)).isEqualTo(0)
    }
}
