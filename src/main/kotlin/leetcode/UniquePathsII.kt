package leetcode

/**
 * https://leetcode.com/problems/unique-paths-ii/
 *
 * #dynamic programming
 * #斜對角loop: [i, j], [i-1, j+1], ...
 */
class UniquePathsII {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val m = obstacleGrid.size
        val n = obstacleGrid[0].size

        if (obstacleGrid[0][0] == 1) return 0
        else obstacleGrid[0][0] = 1

        for (i in 1 until m) {
            obstacleGrid[i][0] = if (obstacleGrid[i][0] == 1 ) { 0 } else { obstacleGrid[i - 1][0] }
        }
        for (i in 1 until n) {
            obstacleGrid[0][i] = if (obstacleGrid[0][i] == 1) { 0 } else { obstacleGrid[0][i - 1] }
        }

        for (i in 1 until m) {
            for (j in 1 until n) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0
                    continue
                }
                obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1]
            }
        }
        return obstacleGrid[m - 1][n - 1]
    }
}

fun main(args: Array<String>) {
    val sol = UniquePathsII()
    println(sol.uniquePathsWithObstacles(arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 0))))

    println(sol.uniquePathsWithObstacles(arrayOf(
            intArrayOf(0, 0),
            intArrayOf(0, 1))))

    println(sol.uniquePathsWithObstacles(arrayOf(
            intArrayOf(0, 1))))
}