package leetcode

/** https://leetcode.com/problems/missing-number/ */
class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        var sum = 0
        nums.forEach {
            sum += it
        }
        return nums.size * (nums.size + 1) / 2 - sum
    }
}

fun main(args: Array<String>) {
    val sol = MissingNumber()
    println(sol.missingNumber(intArrayOf(3, 0, 1)))
    println(sol.missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
}
