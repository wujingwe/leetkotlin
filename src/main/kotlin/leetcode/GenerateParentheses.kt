package leetcode

/** https://leetcode.com/problems/generate-parentheses/ */
class GenerateParentheses {
    // Backtracking
    fun generateParenthesis(n: Int): List<String> {
        return backtrack("(", n, 1, 0)
    }

    private fun backtrack(str: String, n: Int, open: Int, close: Int): List<String> {
        val l = mutableListOf<String>()
        if (str.length == 2 * n) {
            l.add(str)
        }

        if (open < n) {
            l.addAll(backtrack("$str(", n, open + 1, close))
        }
        if (open > close) {
            l.addAll(backtrack("$str)", n, open, close + 1))
        }
        return l
    }
}

fun main(args: Array<String>) {
    val sol = GenerateParentheses()
    println(sol.generateParenthesis(1))
    println(sol.generateParenthesis(2))
    println(sol.generateParenthesis(3))
    println(sol.generateParenthesis(4))
}