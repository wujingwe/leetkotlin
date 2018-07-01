package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SingleNumberTest {

    @Test
    fun `Single Number`() {
        val sol = SingleNumber()

        assertThat(sol.singleNumber(intArrayOf(2, 2, 1))).isEqualTo(1)
        assertThat(sol.singleNumber(intArrayOf(4 ,1, 2, 1, 2))).isEqualTo(4)
    }
}