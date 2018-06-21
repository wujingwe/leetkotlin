package leetcode

/**
 * https://leetcode.com/problems/combinations/
 *
 * #backtracking
 */
class Combinations {
    fun combine(n: Int, k: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        backtrack(1, n, k, mutableListOf(), result)
        return result
    }

    private fun backtrack(index: Int, n: Int, k: Int, grab: MutableList<Int>, result: MutableList<List<Int>>) {
        if (grab.size == k) {
            result.add(grab.toList())
            return
        }

        for (i in index .. n) {
            grab.add(i)
            backtrack(i + 1, n, k, grab, result)
            grab.removeAt(grab.lastIndex)
        }
    }
}

fun main(args: Array<String>) {
    val sol = Combinations()
    println(sol.combine(4, 2))
}