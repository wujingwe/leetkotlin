package leetcode

/**
 * https://leetcode.com/problems/subsets/
 *
 * #backtracking
 */
class Subsets {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val grab = mutableListOf<Int>()
        backtrack(nums, 0, grab, result)
        return result
    }

    private fun backtrack(nums: IntArray, start: Int, grab: MutableList<Int>, result: MutableList<List<Int>>) {
        if (start == nums.size) {
            result.add(grab.toList())
            return
        }

        // don't have nums[i]
        backtrack(nums, start + 1, grab, result)

        // have nums[i]
        grab.add(nums[start])
        backtrack(nums, start + 1, grab, result)
        grab.removeAt(grab.lastIndex)
    }
}

fun main(args: Array<String>) {
    val sol = Subsets()
    println(sol.subsets(intArrayOf(1, 2, 3)))
}
