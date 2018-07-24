package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MissingNumberTest {

    @Test
    fun `Missing Number`() {
        val sol = MissingNumber()
        assertThat(sol.missingNumber(intArrayOf(3, 0, 1))).isEqualTo(2)
        assertThat(sol.missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1))).isEqualTo(8)
    }
}
