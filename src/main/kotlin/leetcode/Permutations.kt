package leetcode

/**
 * https://leetcode.com/problems/permutations/
 *
 * Swap the order in {@link #nums} to create all permutations.
 *
 * #backtrack
 */
class Permutations {
    fun permute(nums: IntArray): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        backtrack(nums, 0, ans)
        return ans
    }

    private fun backtrack(nums: IntArray, start: Int, ans: MutableList<List<Int>>) {
        if (start == nums.size) {
            ans.add(nums.toList())
            return
        }

        for (i in start until nums.size) {
            swap(nums, start, i)
            backtrack(nums, start + 1, ans)
            swap(nums, start, i)
        }
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}

fun main(args: Array<String>) {
    val sol = Permutations()
    val result = sol.permute(intArrayOf(1, 2, 3))
    println("$result")

    val result2 = sol.permute(intArrayOf(0, -1, 1))
    println("$result2")
}