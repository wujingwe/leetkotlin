package leetcode

/**
 * https://leetcode.com/problems/unique-paths/
 *
 * #dynamic programming
 */
class UniquePaths {
    fun uniquePaths(m: Int, n: Int): Int {
        val array = Array(n) { IntArray(m) { 1 } }
        for (i in 1 until n) {
            for (j in 1 until m) {
                array[i][j] = array[i - 1][j] + array[i][j - 1]
            }
        }
        return array[n - 1][m - 1]
    }
}

fun main(args: Array<String>) {
    val sol = UniquePaths()
    println(sol.uniquePaths(3, 2))
    println(sol.uniquePaths(7, 3))
}