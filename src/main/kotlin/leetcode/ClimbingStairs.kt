package leetcode

/**
 * https://leetcode.com/problems/climbing-stairs/
 *
 * #dynamic programming
 */
class ClimbingStairs {
    fun climbStairs(n: Int): Int {
        val result = mutableListOf<Int>()

        result.add(1) // 1
        result.add(2) // [1, 1], [2]
        for (i in 2 until n) {
            result.add(result[i - 1] + result[i - 2])
        }
        return result[n - 1]
    }
}

fun main(args: Array<String>) {
    val sol = ClimbingStairs()
    println(sol.climbStairs(2))
    println(sol.climbStairs(3))
}