package leetcode

/** https://leetcode.com/problems/3sum-closest/ */
class ThreeSumClosest {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()

        var minDiff = Int.MAX_VALUE
        var result = 0

        for (i in 0 until nums.size) {
            var begin = i + 1
            var end = nums.size - 1

            while (begin < end) {
                val sum = nums[i] + nums[begin] + nums[end]
                if (sum > target) {
                    end--
                } else {
                    begin++
                }
                val diff = Math.abs(sum - target)
                if (minDiff > diff) {
                    minDiff = diff
                    result = sum
                }
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    val sol = ThreeSumClosest()
    val result = sol.threeSumClosest(intArrayOf(-1, 2, 1, -4), 1)
    println("$result")
}