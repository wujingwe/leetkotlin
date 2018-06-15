package leetcode

/**
 * https://leetcode.com/problems/maximum-subarray/
 *
 * #dynamic programming
 */
class MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var currSum = 0
        nums.forEach { n ->
            currSum = Math.max(n, currSum + n)
            max = Math.max(max, currSum)
        }
        return max
    }
}

fun main(args: Array<String>) {
    val sol = MaximumSubarray()
    println(sol.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println(sol.maxSubArray(intArrayOf(-2, 1)))
}

