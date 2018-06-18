package leetcode

/**
 * https://leetcode.com/problems/minimum-path-sum/
 *
 * #dynamic programming
 */
class MinimumPathSum {
    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size

        for (i in 1 until m) {
            grid[i][0] += grid[i - 1][0]
        }
        for (i in 1 until n) {
            grid[0][i] += grid[0][i - 1]
        }

        for (i in 1 until m) {
            for (j in 1 until n) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1])
            }
        }
        return grid[m - 1][n - 1]
    }
}

fun main(args: Array<String>) {
    val sol = MinimumPathSum()
    println(sol.minPathSum(arrayOf(
            intArrayOf(1, 3, 1),
            intArrayOf(1, 5, 1),
            intArrayOf(4, 2, 1))))
}