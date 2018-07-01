package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BestTimeToBuyAndSellStock2Test {

    @Test
    fun `Best Time to Buy and Sell Stock II`() {
        val sol = BestTimeToBuyAndSellStock2()

        assertThat(sol.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))).isEqualTo(7)
        assertThat(sol.maxProfit(intArrayOf(1, 2, 3, 4, 5))).isEqualTo(4)
        assertThat(sol.maxProfit(intArrayOf(7, 6, 4, 3, 1))).isEqualTo(0)
    }
}