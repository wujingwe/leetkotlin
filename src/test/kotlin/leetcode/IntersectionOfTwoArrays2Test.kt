package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class IntersectionOfTwoArrays2Test {

    @Test
    fun `Intersection of Two Arrays II`() {
        val sol = IntersectionOfTwoArrays2()

        assertThat(sol.intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toList()).isEqualTo(listOf(2, 2))
        assertThat(sol.intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).toList()).isEqualTo(listOf(9, 4))
    }
}
