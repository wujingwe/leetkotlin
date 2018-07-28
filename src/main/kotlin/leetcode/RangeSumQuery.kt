package leetcode

/** 303. Range Sum Query - Immutable (https://leetcode.com/problems/range-sum-query-immutable/) */
class RangeSumQuery(val nums: IntArray) {

    init {
        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1]
        }
    }

    fun sumRange(i: Int, j: Int): Int {
        return if (i == 0) { nums[j] } else { nums[j] - nums[i - 1] }
    }
}

fun main(args: Array<String>) {
    val sol = RangeSumQuery(intArrayOf(-2, 0, 3, -5, 2, -1))
    println(sol.sumRange(0, 2))
    println(sol.sumRange(2, 5))
    println(sol.sumRange(0, 5))
}
