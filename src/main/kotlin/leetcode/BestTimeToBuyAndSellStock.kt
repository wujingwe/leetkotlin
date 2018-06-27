package leetcode

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * #dynamic_programming
 */
class BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var minBuy = Int.MAX_VALUE
        var profit = 0

        prices.forEach {
            minBuy = Math.min(minBuy, it)
            profit = Math.max(it - minBuy, profit)
        }
        return profit
    }
}

fun main(args: Array<String>) {
    val sol = BestTimeToBuyAndSellStock()
    println(sol.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(sol.maxProfit(intArrayOf(7, 6, 4, 3, 1)))
}
