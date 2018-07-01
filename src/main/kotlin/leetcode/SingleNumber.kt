package leetcode

/**
 * https://leetcode.com/problems/single-number/
 *
 * #xor
 */
class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var result = nums[0]
        for (i in 1 until nums.size) {
            result = result xor nums[i]
        }
        return result
    }
}

fun main(args: Array<String>) {
    val sol = SingleNumber()
    println(sol.singleNumber(intArrayOf(2, 2, 1)))
    println(sol.singleNumber(intArrayOf(4 ,1, 2, 1, 2)))
}
