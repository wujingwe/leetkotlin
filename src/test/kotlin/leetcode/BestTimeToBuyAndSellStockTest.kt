package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BestTimeToBuyAndSellStockTest {

    @Test
    fun `Best Time to Buy and Sell Stock`() {
        val sol = BestTimeToBuyAndSellStock()
        assertThat(sol.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))).isEqualTo(5)
        assertThat(sol.maxProfit(intArrayOf(7, 6, 4, 3, 1))).isEqualTo(0)
    }
}
