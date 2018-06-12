package leetcode

/** https://leetcode.com/problems/combination-sum/ */
class CombinationSum {

    // Backtracking
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = mutableListOf<List<Int>>()
        val result = mutableListOf<Int>()
        backtrack(candidates, target, 0, result, ans)
        return ans
    }

    fun backtrack(candidates: IntArray, target: Int, index: Int, trace: List<Int>, ans: MutableList<List<Int>>) {
        for (i in index until candidates.size) {
            val c = candidates[i]
            val v = target - c
            when {
                (v == 0) -> {
                    val set = ArrayList<Int>(trace)
                    set.add(c)
                    ans.add(set)
                }
                (v > 0) -> {
                    val set = ArrayList<Int>(trace)
                    set.add(c)
                    backtrack(candidates, v, i, set, ans)
                }
            }
        }
    }
}

fun main(args: Array<String>) {
    val sol = CombinationSum()
    val result1 = sol.combinationSum(intArrayOf(2, 3, 6, 7), 7)
    println("$result1")

    val result2 = sol.combinationSum(intArrayOf(2, 3, 5), 8)
    println("$result2")

    val result3 = sol.combinationSum(intArrayOf(8, 7, 4, 3), 11)
    println("$result3")

    val result4 = sol.combinationSum(intArrayOf(4, 2, 8), 8)
    println("$result4")
}