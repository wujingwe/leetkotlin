package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SubsetsTest {

    @Test
    fun `Subsets `() {
        val sol = Subsets()

        assertThat(sol.subsets(intArrayOf(1, 2, 3)))
                .isEqualTo(listOf(
                        listOf(),
                        listOf(3),
                        listOf(2),
                        listOf(2, 3),
                        listOf(1),
                        listOf(1, 3),
                        listOf(1, 2),
                        listOf(1, 2, 3)))
    }
}
