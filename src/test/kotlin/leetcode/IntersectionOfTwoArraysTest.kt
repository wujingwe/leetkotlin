package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class IntersectionOfTwoArraysTest {

    @Test
    fun `Intersection of Two Arrays`() {
        val sol = IntersectionOfTwoArrays()

        assertThat(sol.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toList())
                .isEqualTo(listOf(2))
    }
}
