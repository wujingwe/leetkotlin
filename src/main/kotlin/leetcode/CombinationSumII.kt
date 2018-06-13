package leetcode

/**
 * https://leetcode.com/problems/combination-sum-ii/
 *
 * #backtrack
 */
class CombinationSumII {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        val result = mutableListOf<Int>()

        candidates.sort()
        backtrack(candidates, target, 0, result, ans)
        return ans
    }

    fun backtrack(candidates: IntArray, target: Int, index: Int, trace: List<Int>, ans: MutableList<List<Int>>) {
        for (i in index until candidates.size) {
            val c = candidates[i]
            if (i > index && c == candidates[i - 1]) continue

            val v = target - c
            when {
                (v == 0) -> {
                    val set = ArrayList<Int>(trace)
                    set.add(c)
                    ans.add(set)
                }
                (v > 0) -> {
                    val newTrace = ArrayList<Int>(trace)
                    newTrace.add(c)
                    backtrack(candidates, v, i + 1, newTrace, ans)
                }
            }
        }
    }
}

fun main(args: Array<String>) {
    val sol = CombinationSumII()
    val result1 = sol.combinationSum2(intArrayOf(10, 1, 2, 7, 6, 1, 5), 8)
    println("$result1")

    val result2 = sol.combinationSum2(intArrayOf(2, 5, 2, 1, 2), 5)
    println("$result2")
}