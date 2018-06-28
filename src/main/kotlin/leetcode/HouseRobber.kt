package leetcode

/**
 * https://leetcode.com/problems/house-robber/
 *
 * #dynamic_programming
 */
class HouseRobber {
    fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        if (nums.size > 1) {
            nums[1] = Math.max(nums[0], nums[1])
        }
        for (i in 2 until nums.size) {
            nums[i] = Math.max(nums[i - 1], nums[i - 2] + nums[i])
        }
        return nums[nums.lastIndex]
    }
}


fun main(args: Array<String>) {
    val sol = HouseRobber()
    println(sol.rob(intArrayOf(1, 2, 3, 1)))
    println(sol.rob(intArrayOf(2, 7, 9, 3, 1)))
    println(sol.rob(intArrayOf(2, 1, 1, 2)))
}
