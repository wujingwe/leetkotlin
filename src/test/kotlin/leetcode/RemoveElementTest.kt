package leetcode

import org.assertj.core.api.Assertions
import org.junit.Test

class RemoveElementTest {

    @Test
    fun `Remove Element`() {
        val sol = RemoveElement()

        val array1 = intArrayOf(3, 2, 2, 3)
        Assertions.assertThat(sol.removeElement(array1, 3)).isEqualTo(2)
        Assertions.assertThat(array1.asList().subList(0, 2)).isEqualTo(listOf(2, 2))

        val array2 = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        Assertions.assertThat(sol.removeElement(array2, 2)).isEqualTo(5)
        Assertions.assertThat(array2.asList().subList(0, 5)).isEqualTo(listOf(0, 1, 3, 0, 4))
    }
}