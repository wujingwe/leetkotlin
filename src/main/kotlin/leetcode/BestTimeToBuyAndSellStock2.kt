package leetcode

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 * #greedy
 */
class BestTimeToBuyAndSellStock2 {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0

        for (i in 0 until prices.size - 1) {
            if (prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i]
            }
        }
        return profit
    }
}

fun main(args: Array<String>) {
    val sol = BestTimeToBuyAndSellStock2()
    println(sol.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(sol.maxProfit(intArrayOf(1, 2, 3, 4, 5)))
    println(sol.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
}
